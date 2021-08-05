package com.codegym.casestudy.service.User;

import java.util.ArrayList;
import java.util.List;

import com.codegym.casestudy.dao.RoleDao;
import com.codegym.casestudy.dao.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserDetailsServiceImp implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao appRoleDAO;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        com.codegym.casestudy.model.user.User appUser = this.userDao.findUserAccount(userName);

        if (appUser == null) {
            System.out.println("User not found! " + userName);
            throw new UsernameNotFoundException("User " + userName + " was not found in the database");
        }

        System.out.println("Found User: " + appUser);

        // [ROLE_USER, ROLE_ADMIN,..]
        List<String> roleNames = this.appRoleDAO.getRoleNames(com.codegym.casestudy.model.user.User.getId());

        List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
        if (roleNames != null) {
            for (String role : roleNames) {
                // ROLE_USER, ROLE_ADMIN,..
                GrantedAuthority authority = new SimpleGrantedAuthority(role);
                grantList.add(authority);
            }
        }

        UserDetails userDetails = (UserDetails) new User(com.codegym.casestudy.model.user.User.getUsername(), //
                com.codegym.casestudy.model.user.User.getPassword(), grantList);

        return userDetails;
    }

}
