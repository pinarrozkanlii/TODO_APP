package com.demo.springdemo.repositories;
import com.demo.springdemo.models.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem,Long> {
}
