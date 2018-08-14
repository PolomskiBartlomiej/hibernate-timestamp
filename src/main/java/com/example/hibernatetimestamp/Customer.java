package com.example.hibernatetimestamp;

import lombok.Builder;
import lombok.Value;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by mtumilowicz on 2018-08-14.
 */
@Entity
@Value
@Builder(toBuilder = true)
class Customer {
    @Id
    @GeneratedValue        
    Long id;
    
    String firstName;
    
    @CreationTimestamp
    LocalDate creationTimestamp;
    
    @UpdateTimestamp
    LocalDateTime updateTimestamp;
}
