package com.main.test;

import org.apache.ibatis.session.SqlSession;

import com.main.bean.Person;
import com.main.factory.FKSqlSessionFactory;
import com.main.mapper.PersonMapper;

public class OneToOneTest {
	
	public static void main(String[] args) {
		SqlSession session=FKSqlSessionFactory.getSqlSession();
		OneToOneTest oneTest=new OneToOneTest();
		oneTest.selectPersonById(session);
	}
	
	public void selectPersonById(SqlSession session){
		PersonMapper pm=session.getMapper(PersonMapper.class);
		Person p=pm.selectPersonById(1);
		System.out.println(p);
		session.commit();
		session.close();
	}
}
