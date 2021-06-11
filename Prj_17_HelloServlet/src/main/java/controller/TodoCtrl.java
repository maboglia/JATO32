package controller;

import java.util.ArrayList;

import model.Todo;

public class TodoCtrl {

	private ArrayList<Todo> todos;

	public TodoCtrl() {
		this.todos = new ArrayList<>();
	}
	
	public void addTodo(String todo) {
		this.todos.add(new Todo(todo));
	}
	
	public ArrayList<Todo> getTodos() {
		return todos;
	}
	
}
