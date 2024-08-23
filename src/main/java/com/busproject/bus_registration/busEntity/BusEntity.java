package com.busproject.bus_registration.busEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BusEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id ;
    String userName;
    String userEmail;
    String userMobileNo;
}
