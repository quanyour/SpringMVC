package com.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.main.bean.Article;

public interface ArticleMapper {
	
	@Select("select * from tb_article where id in(select article_id from tb_item where order_id=#{id})")
	List<Article> selectByOrderId();
}
