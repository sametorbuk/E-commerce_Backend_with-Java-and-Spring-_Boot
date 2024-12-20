package com.teknotik.ecommmerce_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "address" , schema = "ecommerce")
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "district")
    private String district;

    @Column(name = "neighborhood")
    private String neighborhood;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "phone")
    private String phone;

    @Column(name = "city")
    private String city;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
    @JoinColumn(name = "user_id" , referencedColumnName = "id")
    private User user;


    public Address(String city, String district, String name, String neighborhood, String phone, String surname, String title) {
        this.city = city;
        this.district = district;
        this.name = name;
        this.neighborhood = neighborhood;
        this.phone = phone;
        this.surname = surname;
        this.title = title;
    }
}
