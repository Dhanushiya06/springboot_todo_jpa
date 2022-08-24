package com.nseit.springboot_todo_jpa.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Todo {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Boolean completed;
}

