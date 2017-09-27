package com.main.mapper;

import org.apache.ibatis.annotations.Select;

import com.main.bean.User3;

public interface User3Mapper {
	
	@Select("select * from tb_user3 where id=#{id}")
	User3 selectById(Integer id);
}
