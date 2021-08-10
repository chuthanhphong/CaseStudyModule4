package com.codegym.casestudy.model.apartment;

import com.codegym.casestudy.model.apartment.Apartment;
import com.codegym.casestudy.model.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    Apartment apartment;
    @ManyToOne
    private User user;
    private String cmtContent;

    public Comment(Apartment apartment, User user, String postContent) {
        this.apartment = apartment;
        this.user = user;
        this.cmtContent = postContent;
    }

    public Comment() {
    }
}
