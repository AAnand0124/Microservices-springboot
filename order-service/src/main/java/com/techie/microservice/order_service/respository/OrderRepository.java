package com.techie.microservice.order_service.respository;

import com.techie.microservice.order_service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
    // Spring Data JPA implements the logic to write logic automatically.

}
