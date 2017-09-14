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
			//��ȡmybatis-config.xml�ļ�
			InputStream inputStream=Resources.getResourceAsStream("mybatis_config.xml");
			//��ʼ��mybatis������SqlSessionFactory��ʵ��
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			//����Sessionʵ��
			SqlSession session=sqlSessionFactory.openSession();
			//���� User����
			User user=new User("admin","��",24);
			//��������
			session.insert("mybatis.mapper.UserMapper.save",user);
			//�ύ����
			session.commit();
			//�ر�Session
			session.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
