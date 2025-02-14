package com.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.main.bean.Student;

public interface StudentMapper {
	
	@Select("select * from tb_student where clazz_id=#{id}")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="name",property="name"),
		@Result(column="sex",property="sex"),
		@Result(column="age",property="age")
	})
	List<Student> selectByClazzId(Integer clazz_id);
}
