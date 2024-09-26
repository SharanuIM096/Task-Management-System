package project1;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

	private List<Task> tasks;
	private int nextId;

	TaskManager() {
		this.tasks = new ArrayList<>();
		this.nextId = 1;

	}

	public void addTask(String description) {
		Task task = new Task(description, nextId);
		tasks.add(task);
		nextId++;
	}
	
	public void listTasks() {
		if(tasks.isEmpty()) {
			System.out.println("No Task Found");
		}
		
		else {
			for(Task t:tasks) {
				System.out.println(t);
			}
		}
	}
	
	public void complteTask(int nextId) {
		for(Task t:tasks) {
			if(t.getTaskId()==nextId) {
				t.completed();
				System.out.println("Task Mark as Completed");
				return;
			}
			else {
				System.out.println(nextId+" Id is not found");
			}
		}
		
	}
	
	public void deleteTask(int id) {
	 tasks.removeIf(t->t.getTaskId()==id);
	 System.out.println("task deleted sucessfully");
	}

}
