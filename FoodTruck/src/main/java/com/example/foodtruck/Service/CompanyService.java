package com.example.foodtruck.Service;

import com.example.foodtruck.Repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CompanyService {
    private final CompanyRepository companyRepository;
}
