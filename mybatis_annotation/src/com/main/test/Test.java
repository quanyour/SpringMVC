package com.main.test;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.session.SqlSession;

import com.main.bean.User;
import com.main.factory.FKSqlSessionFactory;
import com.main.mapper.UserMapper;

public class Test {

	public static void main(String[] args) {
		
		SqlSession session=FKSqlSessionFactory.getSqlSession();
		Test ts=new Test();
		ts.selectAll(session);
	}
	
	public void insert(SqlSession session){
		UserMapper um=session.getMapper(UserMapper.class);
		User user=new User();
		user.setAge(11);
		user.setName("luffy");
		user.setSex("ÄÐ");
		um.saveUser(user);
		System.out.println(user.getId());
		session.commit();
		session.close();
	}
	
	public void Select(SqlSession session){
		UserMapper um=session.getMapper(UserMapper.class);
		User user=um.selectUserById(1);
		System.out.println(user);
		session.commit();
		session.close();
	}	
	
	public void update(SqlSession session){
		UserMapper um=session.getMapper(UserMapper.class);
		User user= um.selectUserById(1);
		System.out.println(user);
		user.setAge(123);
		um.modifyUser(user);
		System.out.println(user);
		session.commit();
		session.close();
	}	
	
	
	public void delete(SqlSession session){
		UserMapper um=session.getMapper(UserMapper.class);
		um.removeUser(12);
		session.commit();
		session.close();
	}	
	
	
	public void selectAll(SqlSession session){
		UserMapper um=session.getMapper(UserMapper.class);
		List<User> list=um.selectAllUser();
		list.forEach(user->System.out.println(user));
		session.commit();
		session.close();
	}	
}
