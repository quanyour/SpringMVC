package com.main.mapper;

import com.main.bean.Person;

public interface PersonMapper {
	
	/**
	 * 根据id查询Person
	 * 方法名和参数必须和XML文件的<select.../>元素的id属性和parameterType属性一致
	 * @param id
	 * @return Person对象
	 */
	Person selectPersonById(Integer id); 
}
