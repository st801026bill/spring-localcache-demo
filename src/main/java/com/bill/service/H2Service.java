package com.bill.service;

import com.bill.dao.TodoListDao;
import com.bill.entity.TodoList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.commons.collections4.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class H2Service implements ICacheService {

    @Autowired
    private TodoListDao todoListDao;

    private static ConcurrentMap<Integer, TodoList> H2_MAP = new ConcurrentHashMap<>();

    @Override
    public void updateCache() {
        List<TodoList> todoLists = todoListDao.findAll();
        H2_MAP = todoLists.stream().collect(Collectors.toConcurrentMap(TodoList::getSeqNo, Function.identity()));
    }

    @Override
    public void createTodoList(TodoList todoList) {
        todoListDao.save(todoList);
        updateCache();
    }

    @Override
    public void updateTodoList(TodoList todoList) {
        todoListDao.save(todoList);
        updateCache();
    }

    @Override
    public void deleteTodoList(TodoList todoList) {
        todoListDao.delete(todoList);
        updateCache();
    }

    @Override
    public TodoList queryTodo(Integer seqNo) {
        return MapUtils.getObject(H2_MAP, seqNo);
    }

    @Override
    public List<TodoList> queryTodoList() {
        return new ArrayList<>(H2_MAP.values());
    }
}
