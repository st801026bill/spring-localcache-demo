package com.bill.controller;

import com.bill.dto.TodoListCreateReqDto;
import com.bill.dto.TodoListDeleteReqDto;
import com.bill.dto.TodoListQueryReqDto;
import com.bill.dto.TodoListQueryResDto;
import com.bill.dto.TodoListUpdateReqDto;
import com.bill.service.ITodoListService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "TodoListController", description = "代辦清單建立服務")
@RestController
public class TodoListController {
    @Autowired
    private ITodoListService service;

    @Operation(summary = "代辦事項新增", description = "代辦事項新增")
    @PostMapping("/todo/create")
    public String createTodo(@RequestBody TodoListCreateReqDto reqDto) {
        service.createTodoList(reqDto);
        return "send message success";
    }

    @Operation(summary = "代辦事項修改", description = "代辦事項修改")
    @PostMapping("/todo/update")
    public String updateTodo(@RequestBody TodoListUpdateReqDto reqDto) {
        service.updateTodoList(reqDto);
        return "send message success";
    }

    @Operation(summary = "代辦事項刪除", description = "代辦事項刪除")
    @PostMapping("/todo/delete")
    public String deleteTodo(@RequestBody TodoListDeleteReqDto reqDto) {
        service.deleteTodoList(reqDto);
        return "send message success";
    }

    @Operation(summary = "代辦事項查詢", description = "代辦事項查詢")
    @GetMapping("/todo/query/{seqNo}")
    public TodoListQueryResDto queryTodo(@PathVariable Integer seqNo) {
        return service.queryTodo(seqNo);
    }

    @Operation(summary = "代辦清單查詢", description = "代辦清單查詢")
    @GetMapping("/todo/query")
    public List<TodoListQueryResDto> queryTodoList() {
        return service.queryTodoList();
    }
}
