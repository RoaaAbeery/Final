package com.example.foodtruck.Service;

import com.example.foodtruck.Api.ApiException;
import com.example.foodtruck.Model.Address;
import com.example.foodtruck.Model.Company;
import com.example.foodtruck.Repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CompanyService {
    private final CompanyRepository companyRepository;
    public List<Company> getAll(){
        return companyRepository.findAll();
    }
    public void addCompany(Company company){
        Company add=companyRepository.findCompaniesById(company.getId());
        if (add == null) {
            throw new ApiException("the id nt found");
        }
        companyRepository.save(company);
    }
    public void updateCompany(Integer auth ,Company company) {
        Company oldadd = companyRepository.findCompaniesById(auth);
        if (oldadd == null) {
            throw new ApiException("the id nt found");
        }
        company.setId(oldadd.getId());
        companyRepository.save(company);
    }
    public void deleteCompany(Integer auth){
        Company com = companyRepository.findCompaniesById(auth);
        if (com == null) {
            throw new ApiException("the id nt found");
        }
        companyRepository.delete(com);
    }
}
