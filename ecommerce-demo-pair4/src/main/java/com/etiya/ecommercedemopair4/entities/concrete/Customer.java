package com.etiya.ecommercedemopair4.entities.concrete;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customers")
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column
    private String password;

    @OneToMany(mappedBy = "customer")
    private List<Cart> carts;

    @OneToMany(mappedBy = "customer")
    private List<CustomerAddress> customerAddresses;

    @OneToMany(mappedBy = "customer")
    private List<CustomerReview> customerReviews;

    @OneToMany(mappedBy = "customer")
    private List<PaymentMethod> paymentMethods;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;
}
