package com.sidhanta.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sidhanta.crm.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}