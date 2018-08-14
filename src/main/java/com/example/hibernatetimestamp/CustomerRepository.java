package com.example.hibernatetimestamp;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mtumilowicz on 2018-08-14.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
