//package com.codegym.casestudy.model.order;
//
//import com.codegym.casestudy.model.apartment.Apartment;
//import com.codegym.casestudy.model.user.User;
//import lombok.Getter;
//import lombok.Setter;
//
//import javax.persistence.*;
//
//@Entity
//@Getter @Setter
//public class Order {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//    @ManyToOne
//    Apartment apartment;
//    @ManyToOne
//    private User user;
//    private String postTitle;
//    private String postContent;
//
//    public Order(Apartment apartment, User user, String postTitle, String postContent) {
//        this.apartment = apartment;
//        this.user = user;
//        this.postTitle = postTitle;
//        this.postContent = postContent;
//    }
//
//    public Order() {
//    }
//}
