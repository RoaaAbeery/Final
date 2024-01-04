package com.example.foodtruck.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class FoodTruck {
    @Id
   private Integer id;
    private  String License;
    private String startDate;
    private Integer NumberOfEmployee;
    private String city;
    private String condition;
}
