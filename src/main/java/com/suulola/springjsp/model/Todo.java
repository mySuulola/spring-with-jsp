package com.suulola.springjsp.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name="todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String user;

    @Size(min = 10, message = "Enter at least 10 characters. . . ")
    private String description;

    private Date deadline;
    private boolean isCompleted;

    public Todo() {
        super();
    }

    public Todo(
            String user,
            String description,
            Date deadline,
            boolean isCompleted) {
        this.user = user;
        this.description = description;
        this.deadline = deadline;
        this.isCompleted = isCompleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }



    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                ", isCompleted=" + isCompleted +
                '}';
    }
}
