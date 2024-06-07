package com.netzwerk.ecommerce.controller;

import com.netzwerk.ecommerce.dto.UserModel;
import com.netzwerk.ecommerce.serv.UserServ;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
@Data
public class UserController {

    private final UserServ service;

    @GetMapping("/login")
    public String getLoginPage(){
        return "login_page";
    }

    @GetMapping("/registration")
    public String getRegistrationPage(Model model){
        model.addAttribute("user",new UserModel());
        return "registration_page";
    }

    @PostMapping("/registration")
    public String registerUser(@ModelAttribute UserModel user){
        service.register(user);
        return "redirect:/login_page?success";
    }
}
