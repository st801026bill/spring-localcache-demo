package com.bill.service.subject;

import com.bill.dto.TodoListCreateReqDto;
import com.bill.dto.TodoListDeleteReqDto;
import com.bill.dto.TodoListUpdateReqDto;
import com.bill.entity.TodoList;

import java.util.List;

public interface IH2Service {
    public void createTodoList(TodoListCreateReqDto reqDto);
    public void updateTodoList(TodoListUpdateReqDto reqDto);
    public void deleteTodoList(TodoListDeleteReqDto todoList);
}
