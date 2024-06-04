package com.netzwerk.ecommerce.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name = "users")
public class UserModel {
    private String username;
    private String password;
    private String role;
}
