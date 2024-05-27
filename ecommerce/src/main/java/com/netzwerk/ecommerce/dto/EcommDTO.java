package com.netzwerk.ecommerce.dto;

import jakarta.persistence.*;
import lombok.*;


@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "development")
public class EcommDTO  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String model;
    private String make;
    private String type;
    private String price;
    private String stockQuantity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(String stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    @Override
    public String toString() {
        return "EcommDTO{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", stockQuantity='" + stockQuantity + '\'' +
                '}';
    }
}
