package project1;

import java.util.Scanner;

public class TaskApp {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		TaskManager taskManager=new TaskManager();
		
		
		while(true) {
			System.out.println("1  AddTask");
			System.out.println("2  List Task");
			System.out.println("3  Mark Task As A completed");
			System.out.println("4  Delete Task");
			System.out.println("5  Exit");
			System.out.println("Enter your choice");
			
			
			int choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			
			case 1:System.out.println("Enter the Task Description");
			String description=sc.nextLine();
			taskManager.addTask(description);
			break;
			
			
			case 2: System.out.println("All Tasks");
			taskManager.listTasks();
			break;
			
			case 3: System.out.println("Enter task ID to mark as completed:");
			int nextId=sc.nextInt();
			taskManager.complteTask(nextId);
			break;
			
			case 4:System.out.println("Enter the id to Delete the task");
			int id=sc.nextInt();
			taskManager.deleteTask(id);
			System.out.println(id+" is delted sucessfully");
			break;
			
			case 5:System.out.println("\"Exiting Task Management Application. Goodbye!\"");
			sc.close();
			System.exit(0);
			
			default :System.out.println("invalid choice");
			}
			
			
			
		}
		
		
	}

}
