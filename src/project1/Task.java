package project1;

public class Task {
	
	private int taskId;
	private String description;
	private boolean completed;
	
	
	 Task(String description,int taskId){
		 
		 this.taskId=taskId;
		 this.description=description;
		 this.completed=false;
		 
	 }



	public int getTaskId() {
		return taskId;
	}

	public String getDescription() {
		return  description;
	}


	public boolean isCompleted() {
		return completed;
	}


	public void completed() {
		this.completed = completed;
	}



	@Override
	public String toString() {
	
		return taskId+" "+description;
		
		//return "["+taskId+"]"+description+(completed?"(completed)":"");
	}
	 
	 
	
	
	

}
