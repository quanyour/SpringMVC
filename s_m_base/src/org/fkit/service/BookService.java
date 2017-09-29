package org.fkit.service;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Book;
import org.springframework.stereotype.Service;


public interface BookService {
	
	/**
	 * 查找所有图书
	 * @return Book对象集合
	 */
	List<Book> getAll();
}
