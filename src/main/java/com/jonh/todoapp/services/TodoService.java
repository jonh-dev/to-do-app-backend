package com.jonh.todoapp.services;

import com.jonh.todoapp.entities.Todo;
import com.jonh.todoapp.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public Todo findById(Integer id) {
        Optional<Todo> obj = repository.findById(id);
        return obj.orElse(null);
    }


    public List<Todo> findAllOpen() {
        List<Todo> list = repository.findAllOpen();
        return list;
    }

    public List<Todo> findAllClose() {
        List<Todo> list = repository.findAllClose();
        return list;
    }

    public List<Todo> findAll() {
        List<Todo> list = repository.findAll();
        return list;
    }

    public Todo create(Todo obj) {
        obj.setId(null);
        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
