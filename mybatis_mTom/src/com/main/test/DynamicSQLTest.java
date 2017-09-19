package com.main.test;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.main.bean.Employee;
import com.main.factory.FKSqlSessionFactory;
import com.main.mapper.EmployeeMapper;

public class DynamicSQLTest {

	public static void main(String[] args) {
		SqlSession session=FKSqlSessionFactory.getSqlSession();
		
		
		DynamicSQLTest dynamicSQLTest=new DynamicSQLTest();
		dynamicSQLTest.selectEmployeeLike(session);
		session.commit();
		session.close();
	}
	
	public void testSelectEmployeeByIdLike(SqlSession session){
		EmployeeMapper em=session.getMapper(EmployeeMapper.class);
		HashMap<String, Object> params=new HashMap<>();
		params.put("id", 1);
		List<Employee> list=em.selectEmployeeByIdLike(params);
		list.forEach(employee->System.out.println(employee));
	}
	
	public void selectEmployeeChoose(SqlSession session){
		EmployeeMapper em=session.getMapper(EmployeeMapper.class);
		HashMap<String, Object> params=new HashMap<>();
//		params.put("id", 1);
//		params.put("loginname", "jack");
//		params.put("password", "1231123");
		List<Employee> list=em.selectEmployeeChoose(params);
		list.forEach(employee->System.out.println(employee));
	}
	
	public void selectEmployeeLike(SqlSession session){
		EmployeeMapper em=session.getMapper(EmployeeMapper.class);
		HashMap<String, Object> params=new HashMap<>();
		params.put("id", 1);
		params.put("loginname", "jack");
		params.put("password", "1231123");
		params.put("state", "ACTIVE");
		List<Employee> list=em.selectEmployeeLike(params);
		list.forEach(employee->System.out.println(employee));
	}
}
