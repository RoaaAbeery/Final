package com.example.foodtruck.Service;

import com.example.foodtruck.Repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrderService {
    private final OrderRepository orderRepository;
}
