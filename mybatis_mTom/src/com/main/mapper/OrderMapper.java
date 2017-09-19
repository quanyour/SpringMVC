package com.main.mapper;

import com.main.bean.Order;

public interface OrderMapper {
	Order selectOrderById(int id);
}
