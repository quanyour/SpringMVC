package com.main.factory;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class FKSqlSessionFactory {

	private static SqlSessionFactory sqlSessionFactory=null;
	
	//��ʼ������SqlSessionFactory����
	static{
		try {
			//��ȡmybatis-config.xml�ļ�
			InputStream inputStream=Resources.getResourceAsStream("mybatis_config.xml");
			//��ʼ��mybatis������SqlSessionFactory��ʵ��
			sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ��ȡSqlSession����ľ�̬����
	 * @return
	 */
	public static SqlSession getSqlSession(){
		return sqlSessionFactory.openSession();
	}
	
	/**
	 * ��ȡSqlSessionFactory�ľ�̬����
	 * @return
	 */
	public static SqlSessionFactory getSqlSessionFactory(){
		return sqlSessionFactory;
	}
}
