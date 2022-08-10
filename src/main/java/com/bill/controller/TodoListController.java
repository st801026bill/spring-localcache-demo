package com.bill.controller;

import com.bill.service.ITodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoListController {
    @Autowired
    private ITodoListService service;

    
}
