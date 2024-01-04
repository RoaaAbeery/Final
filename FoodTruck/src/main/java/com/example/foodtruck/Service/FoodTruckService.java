package com.example.foodtruck.Service;

import com.example.foodtruck.Repository.FoodTruckRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class FoodTruckService {
    private final FoodTruckRepository foodTruckRepository;
}
