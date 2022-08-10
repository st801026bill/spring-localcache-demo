package com.bill.service;

import com.bill.dto.RequestBlankReqDto;
import com.bill.dto.TodoListCreateReqDto;
import com.bill.dto.TodoListDeleteReqDto;
import com.bill.dto.TodoListQueryResDto;
import com.bill.dto.TodoListUpdateReqDto;
import com.bill.entity.TodoList;
import java.util.List;

public interface ICacheService {
    public void updateCache();

    public void createTodoList(TodoList todoList);
    public void updateTodoList(TodoList todoList);
    public void deleteTodoList(TodoList todoList);

    public TodoList queryTodo(Integer seqNo);
    public List<TodoList> queryTodoList();
}
