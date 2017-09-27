package com.main.test;

import org.apache.ibatis.session.SqlSession;

import com.main.bean.Clazz;
import com.main.factory.FKSqlSessionFactory;
import com.main.mapper.ClazzMapper;

public class OneToManyTest {
	
	public static void main(String[] args) {
		SqlSession session=FKSqlSessionFactory.getSqlSession();
		OneToManyTest on=new OneToManyTest();
		on.onToManyTest(session);
	}
	
	public void onToManyTest(SqlSession session){
		ClazzMapper cm=session.getMapper(ClazzMapper.class);
		Clazz clazz=cm.selectById(1);
		System.out.println(clazz);
		clazz.getStudent().forEach(student->System.out.println(student));
		session.commit();
		session.close();
	}
}
