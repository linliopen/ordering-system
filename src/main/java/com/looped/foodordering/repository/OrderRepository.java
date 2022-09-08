package com.looped.foodordering.repository;

import com.looped.foodordering.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * User: looped
 * DateTime: 2022/9/6 00:56
 * Description:
 * History:
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
