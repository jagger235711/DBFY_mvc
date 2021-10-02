package org.fkit.mapper;

import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * BookMapper接口
 * */
@Repository
public interface BookMapper {

	/**
	 * 查询所有图书
	 * @return 图书对象集合
	 * */
	@Select(" select * from tb_book ")
	List<Book> findAll();
	
}
