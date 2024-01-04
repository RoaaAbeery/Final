package com.example.foodtruck.Model;

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
public class User {
    @Id
    private Integer id;
    private  String UserName;
    private String Password;
    private  String email;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
    private Set<Address> addresses;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
    private Set<Order> orders;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "customer")
    @PrimaryKeyJoinColumn
    private Profile profile;

}
