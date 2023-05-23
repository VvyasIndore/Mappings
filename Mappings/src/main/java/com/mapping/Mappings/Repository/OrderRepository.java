package com.mapping.Mappings.Repository;

import com.mapping.Mappings.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long>
{
    @Query("SELECT o.customer.name, COUNT(o) FROM Order o GROUP BY o.customer.name")
    List<Object[]> getOrderCountByCustomer();

    @Query("SELECT o.customer.name, o.orderNumber FROM Order o ORDER BY o.customer.name")
    List<Object[]> getOrdersOrderedByCustomerName();

    @Query("SELECT o.customer.name, COUNT(o) FROM Order o WHERE o.customer.name LIKE %:keyword% GROUP BY o.customer.name")
    List<Object[]> getOrderCountsByCustomerLike(@Param("keyword") String keyword);

}
