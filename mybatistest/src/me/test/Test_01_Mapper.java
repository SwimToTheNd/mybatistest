package me.test;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import me.dao.BookMapper;
import me.domain.Book;
import me.util.MyBatisUtil;

public class Test_01_Mapper {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
		Book book = bookMapper.getBookById(100);
		Map<String, Book> map = new HashMap<String, Book>();
		map.put("book", book);
		System.out.println(book);
		System.out.println(JSON.toJSONString(map, SerializerFeature.WriteDateUseDateFormat));
		// JSON.DEFFAULT_DATE_FORMAT = "yyyy/mm/dd";
		System.out.println(JSON.toJSONString(book, SerializerFeature.WriteDateUseDateFormat));
		System.out.println(book.toString());
		// 获得所有的Book
		System.out.println("=============================================");
		List<Book> lBooks = bookMapper.getAllBooks();
		System.out.println(JSON.toJSONString(lBooks, SerializerFeature.WriteDateUseDateFormat));
		// 添加Bokk
		Book book2 = new Book();
		book2.setId(5);
		book2.setAuthor("韩立");
		book2.setName("凡人修仙传");
		book2.setPublication("东方文化出版社");
		book2.setPublicationdate(new Date(2009, 10, 15));
		book2.setPrice(112.1);
		book2.setImage("xiuxian.jpg");
		book2.setRemark("小说文档");
		int result = bookMapper.insertBook(book2);
		System.out.println("result:"+result);
//		sqlSession.commit();
		System.out.println("===============================================");
	}

}
