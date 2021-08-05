package com.codegym.casestudy.model.house;

import com.codegym.casestudy.model.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titleName;
    private int quantityRoom;
    private int floor;
    private String description;
    private String address;
    @ManyToOne
    private ApartmentType type;
    @ManyToOne
    private User user;


    public Apartment(String titleName, int quantityRoom, int floor, String description, String address, ApartmentType type) {
        this.titleName = titleName;
        this.quantityRoom = quantityRoom;
        this.floor = floor;
        this.description = description;
        this.address = address;
        this.type = type;
    }

    public Apartment() {
    }
}
