package com.main.mapper;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import com.main.bean.Clazz;

public interface ClazzMapper {
	
	@Select("select * from tb_clazz where id=#{id}")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="code",property="code"),
		@Result(id=true,column="name",property="name"),
		@Result(column="id",property="student",
				many=@Many(
						select="com.main.mapper.StudentMapper.selectByClazzId",
						fetchType=FetchType.LAZY
						))
	})
	Clazz selectById(Integer id);
}
