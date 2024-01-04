package com.example.foodtruck.Service;

import com.example.foodtruck.Repository.EvaluationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EvaluationService {
    private final EvaluationRepository evaluationRepository;
}
