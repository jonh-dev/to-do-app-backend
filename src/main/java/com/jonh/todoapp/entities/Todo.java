package com.jonh.todoapp.entities;

import java.time.LocalDateTime;
import java.util.Objects;

public class Todo {

    private Integer id;
    private String title;
    private String description;
    private LocalDateTime dateToFinish;
    private Boolean finished = false;

    public Todo () {

    }

    public Todo(Integer id, String title, String description, LocalDateTime dateToFinish, Boolean finished) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dateToFinish = dateToFinish;
        this.finished = finished;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateToFinish() {
        return dateToFinish;
    }

    public void setDateToFinish(LocalDateTime dateToFinish) {
        this.dateToFinish = dateToFinish;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return Objects.equals(id, todo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
