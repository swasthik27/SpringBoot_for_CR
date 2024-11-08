package com.CRM.CRManager.repository;

import com.CRM.CRManager.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
