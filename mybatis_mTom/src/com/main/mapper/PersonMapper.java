package com.main.mapper;

import com.main.bean.Person;

public interface PersonMapper {
	
	/**
	 * ����id��ѯPerson
	 * �������Ͳ��������XML�ļ���<select.../>Ԫ�ص�id���Ժ�parameterType����һ��
	 * @param id
	 * @return Person����
	 */
	Person selectPersonById(Integer id); 
}
