package com.jonh.todoapp.services;

import com.jonh.todoapp.entities.Todo;
import com.jonh.todoapp.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private TodoRepository todoRepository;

    public void InstanceDB() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Todo t1 = new Todo(null, "Study", "Study Spring with Angular", sdf.parse("25/03/2022"), false);
            Todo t2 = new Todo(null, "Reading", "Reading book about Java", sdf.parse("10/01/2022"), true);
            Todo t3 = new Todo(null, "Exercises", "Practice exercises for better health", sdf.parse("02/02/2022"), true);
            Todo t4 = new Todo(null, "Pay bill", "Pay the electricity bill", sdf.parse("21/03/2022"), false);

            todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
