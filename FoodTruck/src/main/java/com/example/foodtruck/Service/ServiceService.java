package com.example.foodtruck.Service;

import com.example.foodtruck.Repository.ServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ServiceService {
    private final ServiceRepository serviceRepository;
}
