package com.main.mapper;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import com.main.bean.Order;

public interface OrderMapper {
	
	@Select("select * from tb_order where id=#{id}")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="code",property="code"),
		@Result(column="total",property="total"),
		@Result(column="user_id",property="user",
				one=@One(select="com.main.mapper.User3Mapper.selectById",fetchType=FetchType.EAGER)),
		@Result(column="id",property="articles",many=@Many(select="com.main.mapper.ArticleMapper.selectByOrderId",
				fetchType=FetchType.LAZY))
	})
	Order selectById(Integer id);
}
