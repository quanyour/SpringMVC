package com.main.mapper;

import com.main.bean.Clazz;
import com.main.bean.Person;

public interface ClazzMapper {
	
	/**
	 * ����id��ѯPerson
	 * �������Ͳ��������XML�ļ���<select.../>Ԫ�ص�id���Ժ�parameterType����һ��
	 * @param id
	 * @return Person����
	 */
	Clazz selectClazzById(Integer id); 
}
