package com.example.foodtruck.Service;

import com.example.foodtruck.Api.ApiException;
import com.example.foodtruck.Model.Order;
import com.example.foodtruck.Repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class OrderService {
    private final OrderRepository orderRepository;
    public List<Order> getAll(){
        return orderRepository.findAll();
    }
    public void addOrder(Order order){
        Order or=orderRepository.findOrderById(order.getId());
        if (or == null) {
            throw new ApiException("the id nt found");
        }
        orderRepository.save(or);
    }
    public void updateOrder(Integer auth ,Order order) {
        Order oldOrder = orderRepository.findOrderById(auth);
        if (oldOrder == null) {
            throw new ApiException("the id nt found");
        }
        order.setId(oldOrder.getId());
        orderRepository.save(order);
    }
    public void deleteOrder(Integer auth){
        Order order = orderRepository.findOrderById(auth);
        if (order == null) {
            throw new ApiException("the id nt found");
        }
        orderRepository.delete(order);
    }
}
