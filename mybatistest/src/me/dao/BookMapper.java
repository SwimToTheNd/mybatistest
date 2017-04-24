package me.dao;

import java.util.List;
import java.util.Map;

import me.domain.Book;

public interface BookMapper {

	public Book getBookById(int id);

	public List<Book> getAllBooks();

	public int insertBook(Book book);

	public int updateBook(Book book);

	public int deleteBookById(int id);
	
	public List<Object> selectAllBook(String name);
	
	public List<Object> selectListTest();

	public Map<String, Object> selectMapTest();
}
