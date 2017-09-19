package com.main.mapper;

import java.util.HashMap;
import java.util.List;

import com.main.bean.Employee;

public interface EmployeeMapper {
	
	List<Employee> selectEmployeeByIdLike(HashMap<String, Object> params);
	
	List<Employee> selectEmployeeChoose(HashMap<String, Object> params);
	
	List<Employee> selectEmployeeLike(HashMap<String, Object> params);

}
