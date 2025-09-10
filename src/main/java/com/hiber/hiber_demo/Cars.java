package com.hiber.hiber_demo;


import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment
    private int id;

    private String brand;
    private String model;
    private double price;

    public Cars() {}

    public Cars(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Getters & Setters
    public int getId() { return id; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "Car [id=" + id + ", brand=" + brand + ", model=" + model + ", price=" + price + "]";
    }
}

