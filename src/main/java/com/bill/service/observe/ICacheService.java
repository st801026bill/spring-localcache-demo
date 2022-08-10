package com.bill.service.observe;

import com.bill.dto.TodoListQueryResDto;

import java.util.List;

public interface ICacheService {
    public TodoListQueryResDto queryTodo(Integer seqNo);
    public List<TodoListQueryResDto> queryTodoList();
}
