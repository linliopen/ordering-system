package com.looped.foodordering.repository;

import com.looped.foodordering.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * User: looped
 * DateTime: 2022/9/6 00:56
 * Description:
 * History:
 */
@Repository
public interface MenuRepository extends JpaRepository<Menu, Long>{

}
