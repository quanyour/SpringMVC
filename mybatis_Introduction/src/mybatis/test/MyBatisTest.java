package mybatis.test;

import java.io.IOException;
import java.io.InputStream;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mybatis.bean.User;

public class MyBatisTest {
	
	public static void main(String[] args) {

		try {
			//读取mybatis-config.xml文件
			InputStream inputStream=Resources.getResourceAsStream("mybatis_config.xml");
			//初始化mybatis，创建SqlSessionFactory类实例
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			//创建Session实例
			SqlSession session=sqlSessionFactory.openSession();
			//创建 User对象
			User user=new User("admin","男",24);
			//插入数据
			session.insert("mybatis.mapper.UserMapper.save",user);
			//提交事务
			session.commit();
			//关闭Session
			session.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
