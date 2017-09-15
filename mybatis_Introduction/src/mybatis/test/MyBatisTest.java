package mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mybatis.bean.User;
import mybatis.factory.FKSqlSessionFactory;

public class MyBatisTest {
	
	public static void main(String[] args) {

		try {
			//创建Session实例
			SqlSession session=FKSqlSessionFactory.getSqlSession();
			//创建 User对象
//			User user=new User("liudehua","男",57);
			//插入数据,user为所需要的参数，可为对象或map
//			session.insert("mybatis.mapper.UserMapper.save",user);
//			User user1=session.selectOne("mybatis.mapper.UserMapper.selectUser",1);
//			System.out.println(user1);
//			user1.setAge(99);
//			user1.setName("quan");
//			session.update("mybatis.mapper.UserMapper.modifyUser", user1);
//			session.delete("mybatis.mapper.UserMapper.removeUser", 3);
			
//			List<Map<String,Object>> list=session.selectList("mybatis.mapper.UserMapper.selectAll");
//			for(Map<String , Object> rows:list){
//				System.out.println(rows);
//			}
			
			//数据库的列名变了依然可以封装到User对象中
			List<User> user_list=session.selectList("mybatis.mapper.UserMapper.selectUser2");
			for(User user:user_list){
				System.out.println(user);
			}
			
			//提交事务
			session.commit();
			//关闭Session
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
