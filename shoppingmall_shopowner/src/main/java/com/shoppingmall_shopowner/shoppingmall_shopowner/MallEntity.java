package com.shoppingmall_shopowner.shoppingmall_shopowner;

import jakarta.persistence.*;

@Entity
public class MallEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;
    private int numberOfShops;
    private String ownerName;

    public Mall() {
        super();
    }

    public Mall(Long id, String name, String location, int numberOfShops, String ownerName) {
        super();
        this.id = id;
        this.name = name;
        this.location = location;
        this.numberOfShops = numberOfShops;
        this.ownerName = ownerName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfShops() {
        return numberOfShops;
    }

    public void setNumberOfShops(int numberOfShops) {
        this.numberOfShops = numberOfShops;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}