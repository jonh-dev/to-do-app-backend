package com.jonh.todoapp.services;

import com.jonh.todoapp.entities.Todo;
import com.jonh.todoapp.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private TodoRepository todoRepository;

    public void InstanceDB() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Todo t1  = new Todo(null, "Study", "Study Spring with Angular", LocalDateTime.parse("25/03/2022 12:34", formatter), false);
        Todo t2  = new Todo(null, "Reading", "Reading book about Java", LocalDateTime.parse("10/01/2022 09:11", formatter), true);
        Todo t3  = new Todo(null, "Exercises", "Practice exercises for better health", LocalDateTime.parse("02/02/2022 10:15", formatter), true);
        Todo t4  = new Todo(null, "Pay bill", "Pay the electricity bill", LocalDateTime.parse("21/03/2022 08:24", formatter), false);

        todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
    }
}
