package org.fkit.service;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Book;
import org.springframework.stereotype.Service;


public interface BookService {
	
	/**
	 * ��������ͼ��
	 * @return Book���󼯺�
	 */
	List<Book> getAll();
}
