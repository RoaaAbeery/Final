package com.example.foodtruck.Model;

import jakarta.persistence.*;
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
    //category
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "service")
    @PrimaryKeyJoinColumn
    private FoodTruck foodTruck;
    private Integer id;
    private  String product;
    private String truckSize;
    private  String basicDevice;
    private String sideDevice;
    private  String menuDescription;
    private String startDate;
}
