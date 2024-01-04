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
public class Client {
    @Id
    private Integer id;
    private  String UserName;
    private String Password;
    private  String email;
}
