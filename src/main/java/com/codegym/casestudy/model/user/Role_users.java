package com.codegym.casestudy.model.user;

import javax.persistence.*;

@Entity
@Table(name = "Role_Users")
public class Role_users {
    @Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "User_Id", nullable = false)
    private User User;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Role_Id", nullable = false)
    private Role Role;

    public Role_users(Long id, com.codegym.casestudy.model.user.User user, com.codegym.casestudy.model.user.Role role) {
        this.id = id;
        User = user;
        Role = role;
    }

    public Role_users() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public com.codegym.casestudy.model.user.User getUser() {
        return User;
    }

    public void setUser(com.codegym.casestudy.model.user.User user) {
        User = user;
    }

    public com.codegym.casestudy.model.user.Role getRole() {
        return Role;
    }

    public void setRole(com.codegym.casestudy.model.user.Role role) {
        Role = role;
    }
}
