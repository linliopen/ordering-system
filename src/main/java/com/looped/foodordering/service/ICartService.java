package com.looped.foodordering.service;

import com.looped.foodordering.model.Cart;

import java.util.List;

/**
 * User: looped
 * DateTime: 2022/9/6 00:56
 * Description:
 * History:
 */
public interface ICartService {
	List<Cart> getAllCarts();

	void saveCartItem(Long menuId);

	void saveCart(Cart cart);

	void deleteCartById(long id);

}
