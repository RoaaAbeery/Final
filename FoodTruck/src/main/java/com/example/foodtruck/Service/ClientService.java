package com.example.foodtruck.Service;

import com.example.foodtruck.Api.ApiException;
import com.example.foodtruck.Model.Address;
import com.example.foodtruck.Model.Client;
import com.example.foodtruck.Repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClientService {
    private  final ClientRepository clientRepository;
    public List<Client> getAll(){
        return clientRepository.findAll();
    }
    public void addClient(Client client){
        Client add=clientRepository.findClientById(client.getId());
        if (add == null) {
            throw new ApiException("the id nt found");
        }
        clientRepository.save(add);
    }
    public void updateClint(Integer auth ,Client client) {
        Client oldadd = clientRepository.findClientById(auth);
        if (oldadd == null) {
            throw new ApiException("the id nt found");
        }
        client.setId(oldadd.getId());
        clientRepository.save(client);
    }
    public void deleteAddress(Integer auth){
        Client client = clientRepository.findClientById(auth);
        if (client == null) {
            throw new ApiException("the id nt found");
        }
        clientRepository.delete(client);
    }
}
