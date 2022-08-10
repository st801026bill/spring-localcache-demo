package com.bill.service;

import com.bill.dto.RequestBlankReqDto;
import com.bill.dto.TodoListCreateReqDto;
import com.bill.dto.TodoListDeleteReqDto;
import com.bill.dto.TodoListQueryResDto;
import com.bill.dto.TodoListUpdateReqDto;
import com.bill.entity.TodoList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoListService implements ITodoListService {

    @Autowired
    private H2Service h2Service;

    @Override
    public void createTodoList(TodoListCreateReqDto reqDto) {
        h2Service.createTodoList(reqDto.toEntity());
    }

    @Override
    public void updateTodoList(TodoListUpdateReqDto reqDto) {
        h2Service.updateTodoList(reqDto.toEntity());
    }

    @Override
    public void deleteTodoList(TodoListDeleteReqDto reqDto) {
        h2Service.deleteTodoList(reqDto.toEntity());
    }

    @Override
    public TodoListQueryResDto queryTodo(Integer seqNo) {
        TodoList todoList = h2Service.queryTodoList(seqNo);
        TodoListQueryResDto result = new TodoListQueryResDto();
        BeanUtils.copyProperties(todoList, result);
        return result;
    }

    @Override
    public List<TodoListQueryResDto> queryTodoList(RequestBlankReqDto reqDto) {
        return null;
    }
}
