package com.example.foodtruck.Service;

import com.example.foodtruck.Repository.EvaluationRepository;
import com.example.foodtruck.Repository.FoodTruckRepository;
import com.example.foodtruck.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EvaluationService {
    private final EvaluationRepository evaluationRepository;
    private final FoodTruckRepository foodTruckRepository;
    private final UserRepository userRepository;
}
