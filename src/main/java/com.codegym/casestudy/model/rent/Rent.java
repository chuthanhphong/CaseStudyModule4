package com.codegym.casestudy.model.rent;

import com.codegym.casestudy.model.apartment.Apartment;
import com.codegym.casestudy.model.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Apartment apartment;
    private String createDate;
    private String startDate;
    private String endDate;

    public Rent(User user, Apartment apartment) {
        this.user = user;
        this.apartment = apartment;
    }

    public Rent() {
    }
}