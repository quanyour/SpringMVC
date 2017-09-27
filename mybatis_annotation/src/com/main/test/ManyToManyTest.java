package com.main.test;

import org.apache.ibatis.session.SqlSession;

import com.main.bean.Order;
import com.main.factory.FKSqlSessionFactory;
import com.main.mapper.OrderMapper;

public class ManyToManyTest {
	public static void main(String[] args) {
		SqlSession session=FKSqlSessionFactory.getSqlSession();
		ManyToManyTest m=new ManyToManyTest();
		m.manyToMany(session);
	}
	
	
	public void manyToMany(SqlSession session){
		OrderMapper om=session.getMapper(OrderMapper.class);
		Order order=om.selectById(1);
		System.out.println(order);
		System.out.println(order.getUser());
		order.getArticles().forEach(acticle->System.out.println(acticle));
	}
}
