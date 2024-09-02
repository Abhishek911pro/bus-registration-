package com.busproject.bus_registration.repository;

import com.busproject.bus_registration.Entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity , Long> {
}
