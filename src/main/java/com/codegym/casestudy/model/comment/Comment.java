package com.codegym.casestudy.model.comment;
import com.codegym.casestudy.model.apartment.Apartment;
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
    private Date dateCmt;
    private String postContent;
    @ManyToOne
    private Apartment apartment;

    public Comment(Long id, Date dateCmt, String postContent, Apartment apartment) {
        this.id = id;
        this.dateCmt = dateCmt;
        this.postContent = postContent;
        this.apartment = apartment;
    }

    public Comment() {

    }
}
