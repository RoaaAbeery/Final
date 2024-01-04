package com.example.foodtruck.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Profile {
    @Id
    private Integer id;

    @OneToOne
    @MapsId
    @JsonIgnore
    private User user;
}
