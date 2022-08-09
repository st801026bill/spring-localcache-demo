package com.bill.dao;

import com.bill.entity.TodoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoListDao {
	
	@Autowired
	private TodoListRepository repository;
	
	public List<TodoList> fintAll(int page, int size) {
		Page<TodoList> pageResult = repository.findAll(
				PageRequest.of(page, size, Sort.by("updateDateTime").descending()));
		
		return pageResult.getContent();
	}
	
	public List<TodoList> findBySeqNo(int seqNo) {
		return repository.findBySeqNo(seqNo); 
	}
	
	public TodoList save(TodoList content) {
		return repository.save(content);
	}
	
	public void delete(TodoList content) {
		repository.delete(content);
	}
}
