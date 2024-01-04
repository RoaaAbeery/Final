package com.example.foodtruck.Service;

import com.example.foodtruck.Repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AddressService {
    private final AddressRepository addressRepository;
}
