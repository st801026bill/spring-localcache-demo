package com.bill.service.observe;

import com.bill.entity.TodoList;
import java.util.List;

public interface IObserveService {
    public void updateCache(List<TodoList> todoList);
}
