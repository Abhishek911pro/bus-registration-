package com.busproject.bus_registration.Entity;


import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "customer")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cus_id;

    private String cus_Name;

    private String cus_Email;

    private String cus_Mobile;

}
