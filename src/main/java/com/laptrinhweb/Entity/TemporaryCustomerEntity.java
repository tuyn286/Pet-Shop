package com.laptrinhweb.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "tbTemporaryCustomer")
public class TemporaryCustomerEntity {
    @Id
    private String id;
    private String firstname;
    private String lastname;
    private String email;


}
