package com.example.foodtruck.Service;

import com.example.foodtruck.Repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ClintService {
    private  final ClientRepository clientRepository;
}
