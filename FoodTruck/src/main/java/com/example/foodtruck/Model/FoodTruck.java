package com.example.foodtruck.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class FoodTruck {
    @Id
   private Integer id;
    //category
    private  String License;
    private Integer NumberOfEmployee;
    private String status;
    private String name;
    private String phone;
    private String email;
    private String password;
    private Double rate;


 @ManyToOne
    @JoinColumn(name = "category_id",referencedColumnName = "id")
    @JsonIgnore
    private Category category;

    @OneToOne
    @MapsId
    @JsonIgnore
    private Service service;

    @ManyToOne
    @JoinColumn(name = "evaluation_id",referencedColumnName = "id")
    @JsonIgnore
    private Evaluation evaluation;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "foodTruck")
    private Set<Ticket> ticket;
}
