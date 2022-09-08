package com.looped.foodordering.service;

import com.looped.foodordering.model.Order;
import com.looped.foodordering.vo.OrderDetailVo;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * User: looped
 * DateTime: 2022/9/6 00:56
 * Description:
 * History:
 */
public interface IOrderService {
	List<Order> getAllOrders();
	void saveOrder(Order order);
	Order getOrderById(long id);
	void deleteOrderById(long id);
	Page<Order> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);

	List<OrderDetailVo> getOrderDetailByOrderId(long orderId);
}
