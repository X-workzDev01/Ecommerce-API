package com.netzwerk.ecommerce.serv;

import com.netzwerk.ecommerce.dto.UserModel;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UserServ {

    private static List<UserModel> users = new ArrayList<>();

    private final PasswordEncoder passwordEncoder;

    public void register(UserModel user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        users.add(user);
    }

    public UserModel findByLogin (String login){
        return users.stream().filter(user -> user.getUsername().equals(login))
                .findFirst()
                .orElse(null);
    }
}
