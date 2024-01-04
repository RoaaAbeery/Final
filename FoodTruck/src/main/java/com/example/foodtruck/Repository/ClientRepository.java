package com.example.foodtruck.Repository;

import com.example.foodtruck.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ClientRepository extends JpaRepository<Client,Integer> {
}
