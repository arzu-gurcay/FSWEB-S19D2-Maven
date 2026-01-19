package com.workintech.s18d4.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.net.Inet4Address;
@Entity
@Data
@Table(name="ADDRESS")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="street",columnDefinition = "text")
    private String street;
    @Column(name = "no")
    private Integer no;
    @Column(name = "city" , columnDefinition = "text")
    private String city;
    @Column(name = "country", columnDefinition = "text")
    private String country;
    @Column(name = "description", columnDefinition = "text")
    private String description;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
