package com.main.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.main.bean.Employee;
import com.main.factory.FKSqlSessionFactory;
import com.main.mapper.EmployeeMapper;

public class DynamicSQLTest {
	
	public static void main(String[] args) {
		SqlSession session=FKSqlSessionFactory.getSqlSession();
		DynamicSQLTest dynamicSQLTest=new DynamicSQLTest();
		dynamicSQLTest.testSelectWhitParam(session);
	}
	
	public void testSelectWhitParam(SqlSession session){
		EmployeeMapper em=session.getMapper(EmployeeMapper.class);
		
		Map<String,Object> param=new HashMap<>();
		param.put("loginname", "jack");
		param.put("password", "1231123");
		List<Employee> emps=em.selectWhitParam(param);
		emps.forEach(emp->System.out.println(emp));
		session.commit();
		session.close();
	}
}
