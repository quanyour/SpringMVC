package com.main.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.SelectProvider;

import com.main.bean.Employee;

public interface EmployeeMapper {

	@SelectProvider(type=EmployeeDynaSqlProvider.class,method="selectWhitParam")
	List<Employee> selectWhitParam(Map<String,Object> param);
	
	
}
