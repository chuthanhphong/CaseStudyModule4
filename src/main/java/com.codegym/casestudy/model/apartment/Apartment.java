package com.codegym.casestudy.model.apartment;

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
    private String ward;
    private String district;
    private int price;
    @ManyToOne
    private ApartmentType type;
    @ManyToOne
    private User user;

    public Apartment(String titleName, int quantityRoom, int floor, String description, String address, String ward, String district, ApartmentType type, User user) {
        this.titleName = titleName;
        this.quantityRoom = quantityRoom;
        this.floor = floor;
        this.description = description;
        this.address = address;
        this.ward = ward;
        this.district = district;
        this.type = type;
        this.user = user;
    }

    public Apartment() {
    }
}
