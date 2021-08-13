package com.codegym.casestudy.model.image;

import com.codegym.casestudy.model.apartment.Apartment;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pathName;
    @ManyToOne
    private Apartment apartment;

    public Image() {
    }

    public Image(String pathName, Apartment apartment) {
        this.pathName = pathName;
        this.apartment = apartment;
    }
}
