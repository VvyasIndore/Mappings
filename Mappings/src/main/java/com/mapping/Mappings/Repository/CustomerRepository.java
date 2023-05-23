package com.mapping.Mappings.Repository;

import com.mapping.Mappings.Entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customers,Long>
{

}
