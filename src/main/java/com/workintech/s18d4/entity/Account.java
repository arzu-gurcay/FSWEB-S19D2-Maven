package com.workintech.s18d4.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="ACCOUNT")
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "account_name",columnDefinition = "text")
    private String accountName;
    @Column(name = "money_amount")
    private Double moneyAmount;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;
}
