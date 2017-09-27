package com.main.factory;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class FKSqlSessionFactory {

	private static SqlSessionFactory sqlSessionFactory=null;
	
	//初始化创建SqlSessionFactory对象
	static{
		try {
			//读取mybatis-config.xml文件
			InputStream inputStream=Resources.getResourceAsStream("mybatis_config.xml");
			//初始化mybatis，创建SqlSessionFactory类实例
			sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取SqlSession对象的静态方法
	 * @return
	 */
	public static SqlSession getSqlSession(){
		return sqlSessionFactory.openSession();
	}
	
	/**
	 * 获取SqlSessionFactory的静态方法
	 * @return
	 */
	public static SqlSessionFactory getSqlSessionFactory(){
		return sqlSessionFactory;
	}
}
