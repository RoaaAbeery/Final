package com.example.foodtruck.Service;

import com.example.foodtruck.Api.ApiException;
import com.example.foodtruck.Repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class OrderService {
    private final OrderRepository orderRepository;
//    public List<Or> getAll(){
//        return orderRepository.findAll();
//    }
//    public void addFood(FoodTruck foodTruck){
//        FoodTruck food=foodTruckRepository.findFoodTruckById(foodTruck.getId());
//        if (food == null) {
//            throw new ApiException("the id nt found");
//        }
//        foodTruckRepository.save(food);
//    }
//    public void updateFoodTruck(Integer auth ,FoodTruck foodTruck) {
//        FoodTruck OldFoodTruck = foodTruckRepository.findFoodTruckById(auth);
//        if (OldFoodTruck == null) {
//            throw new ApiException("the id nt found");
//        }
//        foodTruck.setId(OldFoodTruck.getId());
//        foodTruckRepository.save(foodTruck);
//    }
//    public void deleteAddress(Integer auth){
//        FoodTruck food = foodTruckRepository.findFoodTruckById(auth);
//        if (food == null) {
//            throw new ApiException("the id nt found");
//        }
//        foodTruckRepository.delete(food);
//    }
}
