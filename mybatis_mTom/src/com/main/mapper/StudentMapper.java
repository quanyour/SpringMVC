package com.main.mapper;

import com.main.bean.Clazz;
import com.main.bean.Person;
import com.main.bean.Student;

public interface StudentMapper {
	
	/**
	 * ����id��ѯPerson
	 * �������Ͳ��������XML�ļ���<select.../>Ԫ�ص�id���Ժ�parameterType����һ��
	 * @param id
	 * @return Person����
	 */
	Student selectStudentById(Integer id); 
}
