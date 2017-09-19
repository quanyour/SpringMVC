package com.main.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.main.bean.Article;
import com.main.bean.Clazz;
import com.main.bean.Order;
import com.main.bean.Person;
import com.main.bean.Student;
import com.main.bean.User3;
import com.main.factory.FKSqlSessionFactory;
import com.main.mapper.ClazzMapper;
import com.main.mapper.OrderMapper;
import com.main.mapper.PersonMapper;
import com.main.mapper.StudentMapper;
import com.main.mapper.User3Mapper;

public class OneToOneTest {
	
	public static void main(String[] args) {
		
		SqlSession session=FKSqlSessionFactory.getSqlSession();
		
		/**
		 * 一对一
		 */
//		PersonMapper pm=session.getMapper(PersonMapper.class);
//		Person p=pm.selectPersonById(1);
//		System.out.println(p);
		
		/**
		 * 一对多
		 */
//		OneToOneTest oneTest=new OneToOneTest();
//		oneTest.testSelectStudentById(session);
		
		
		/**
		 * 用户找订单   一对多
		 */
//		OneToOneTest oneTest=new OneToOneTest();
//		oneTest.testSelectUserById(session);
		
		
		/**
		 * 订单找商品   多对多
		 */
		OneToOneTest oneTest=new OneToOneTest();
		oneTest.testSelectOrderById(session);
		
		session.commit();
		session.close();
	}
	
	public void testSelectOrderById(SqlSession session){
		OrderMapper om=session.getMapper(OrderMapper.class);
		Order order=om.selectOrderById(2);
		System.out.println(order);
		
		User3 user=order.getUser();
		System.out.println(user);
		
		List<Article> articles=order.getArticles();
		for(Article article:articles){
			System.out.println(article);
		}
 	}
	
	
	
	public void testSelectUserById(SqlSession session){
		User3Mapper um=session.getMapper(User3Mapper.class);
		User3 user=um.selectUserById(1);
		System.out.println(user);
		List<Order> orders=user.getOrders();
		for(Order order:orders){
			System.out.println(order);
		}
	}
	
	
	
	public void testSelectClazzById(SqlSession session){
		ClazzMapper cm=session.getMapper(ClazzMapper.class);
		Clazz cl = cm.selectClazzById(1);
		System.out.println(cl);//因为是懒加载，所以没有用到学生就不会去执行查找学生的sql
		
		List<Student> students=cl.getStudent();
		for(Student stu:students){
			System.out.println(stu);
		}
	}
	
	public void testSelectStudentById(SqlSession session){
		StudentMapper sm=session.getMapper(StudentMapper.class);
		Student s=sm.selectStudentById(1);
		System.out.println(s);
		
		System.out.println(s.getClazz());
	}
}
