package com.example.hibernatetimestamp;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityNotFoundException;

/**
 * Created by mtumilowicz on 2018-07-28.
 */
@Component
@AllArgsConstructor
@Slf4j
public class AppRunner implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    @Override
    public void run(String... args) {
        Customer customer = Customer.builder()
                .build();

        Customer savedCustomer = customerRepository.save(customer);

        log.info("after creation: " + savedCustomer);

        Customer customerUpdate = customerRepository.findById(2L).orElseThrow(EntityNotFoundException::new);
        Customer customerToUpdate = customerUpdate.toBuilder()
                .firstName("changed")
                .build();

        Customer updatedCustomer = customerRepository.save(customerToUpdate);

        log.info("after update: " + updatedCustomer);
    }

}
