package model;

public class Todo {

	private String todo;
	private boolean done;

	public Todo(String todo) {
		this.todo = todo;
		this.done = false;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "Todo [todo=" + todo + ", done=" + done + "]";
	}
	
	
	
}
