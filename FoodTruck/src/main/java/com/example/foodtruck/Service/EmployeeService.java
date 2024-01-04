package com.example.foodtruck.Service;

import com.example.foodtruck.Repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
}
