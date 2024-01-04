package com.example.foodtruck.Service;

import com.example.foodtruck.Api.ApiException;
import com.example.foodtruck.Model.Address;
import com.example.foodtruck.Repository.AddressRepository;
import com.example.foodtruck.Repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AddressService {
    private final AddressRepository addressRepository;
     private final CompanyRepository companyRepository;
    public List<Address> getAll(){
        return addressRepository.findAll();
    }
    public void addAddress(Address address){
        Address add=addressRepository.findAddressById(address.getId());
        if (add == null) {
            throw new ApiException("the id nt found");
        }
        addressRepository.save(address);
    }
    public void updateAddress(Integer auth ,Address address) {
        Address oldadd = addressRepository.findAddressById(auth);
        if (oldadd == null) {
            throw new ApiException("the id nt found");
        }
        address.setId(oldadd.getId());
        addressRepository.save(address);
    }
    public void deleteAddress(Integer auth){
        Address address = addressRepository.findAddressById(auth);
        if (address == null) {
            throw new ApiException("the id nt found");
        }
        addressRepository.delete(address);
    }
}
