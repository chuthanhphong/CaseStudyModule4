package com.codegym.casestudy.model.comment;
import com.codegym.casestudy.model.apartment.Apartment;
import com.codegym.casestudy.model.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter @Setter
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String postContent;
    @ManyToOne
    private Apartment apartment;
    @ManyToOne
    private User user;

    public Comment(Long id,  String postContent, Apartment apartment, User user) {
        this.id = id;
        this.postContent = postContent;
        this.apartment = apartment;
        this.user = user;
    }

    public Comment() {

    }
}
