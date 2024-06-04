package com.netzwerk.ecommerce.serv;

import com.netzwerk.ecommerce.dto.UserModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServ {

    private static List<UserModel> users = new ArrayList<>();

    public void register(UserModel user){
        users.add(user);
    }

    public UserModel findByLogin (String login){
        return users.stream().filter(user -> user.getUsername().equals(login))
                .findFirst()
                .orElse(null);
    }
}
