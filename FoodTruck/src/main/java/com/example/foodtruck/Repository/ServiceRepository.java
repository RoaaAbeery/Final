package com.example.foodtruck.Repository;

import com.example.foodtruck.Model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ServiceRepository extends JpaRepository<Service,Integer> {
}
