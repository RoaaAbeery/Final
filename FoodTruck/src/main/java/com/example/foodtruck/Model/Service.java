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
public class Service {
    @Id
    private Integer id;
    private  String product;
    private String size;
    private  String basicDevice;
    private String sideDevice;
    private  String Brief;
    private String startDate;
}
