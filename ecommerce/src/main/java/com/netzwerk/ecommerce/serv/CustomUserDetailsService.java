package com.netzwerk.ecommerce.serv;

import com.netzwerk.ecommerce.dto.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserServ userServ;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel byLogin = userServ.findByLogin(username);
        if (byLogin == null){
            return null;
        }
        return User.builder()
                .username(byLogin.getUsername())
                .password(byLogin.getPassword())
                .roles(byLogin.getRole())
                .build();

    }
}
