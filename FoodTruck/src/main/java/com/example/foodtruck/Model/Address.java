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
public class Address {
    @Id
    private Integer id;
    private  String address;
    private String startDate;
    private Integer NumberWeek;
    private String city;
    private String street;

}
