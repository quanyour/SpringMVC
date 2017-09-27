package com.main.mapper;

import org.apache.ibatis.annotations.Select;

import com.main.bean.Card;

public interface CardMapper {
	
	@Select("select * from tb_card where id=#{id}")
	Card selectCardById(Integer id);
}
