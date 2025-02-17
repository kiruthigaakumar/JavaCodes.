package com.celcom.assignments_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Task{
	String name;
	boolean isCompleted;
	
	public Task(String name,boolean isCompleted) {
		this.name=name;
		this.isCompleted=false;
	}
	public void display() {
		System.out.println("Task "+name+" status "+(isCompleted ?"completed":"pending"));
	}
	public void markAsCompleted() {
		isCompleted=true;
	}
	
}
class TaskManagementSystem{
	private List<Task> tasks;
	public TaskManagementSystem() {
		tasks=new ArrayList<>();
	}
	
	public void addTask(String TaskName) {
		Task newTaskName=new Task(TaskName, false);
		tasks.add(newTaskName);
		System.out.println(TaskName);
		
	}
	public void viewAllTasks() {
		if(tasks.isEmpty())
		{
			System.out.println("No tasks available");
		}
		else {
			System.out.println("Task list is");
			for(int i=0;i<tasks.size();i++)
			{
				tasks.get(i).display();
			}
		}
	}
	public void markAsCompleted(String name) {
		boolean taskFound=false;
		for(int i=0;i<tasks.size();i++)
		{
			if(tasks.get(i).name.equalsIgnoreCase(name)) {
			tasks.get(i).markAsCompleted();
			System.out.println("Task is completed");
			 taskFound = true;
             break;
			}
		}
		 if (!taskFound) {
	            System.out.println("No task found with the name: " + name);
	        }
	}
	public void deleteTask(String name) {
		boolean taskFound=false;
		for(int i=0;i<tasks.size();i++)
		{
			if(tasks.get(i).name.equalsIgnoreCase(name)) {
				tasks.remove(i);
				System.out.println("Task '" + name + "' deleted.");
                taskFound = true;
                break;
            }
        }
        if (!taskFound) {
            System.out.println("No task found with the name: " + name);
        }
			
    }
	public void searchTask(String taskName) {
        boolean found = false;
        for (Task task : tasks) {
            if (task.name.toLowerCase().contains(taskName.toLowerCase())) {
                task.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No tasks found with the name: " + taskName);
        }
    }
}
public class TaskMnagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        TaskManagementSystem system = new TaskManagementSystem();
        int choice;

        do {
            System.out.println("\n--- Task Management System ---");
            System.out.println("1. Add a new task");
            System.out.println("2. View all tasks");
            System.out.println("3. Mark a task as completed");
            System.out.println("4. Delete a task");
            System.out.println("5. Search for tasks");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String taskName = scanner.nextLine();
                    system.addTask(taskName);
                    break;

                case 2:
                    system.viewAllTasks();
                    break;

                case 3:
                    system.viewAllTasks();
                    System.out.print("Enter task to mark as completed: ");
                    String name=scanner.nextLine();
                    system.markAsCompleted(name);
                    break;

                case 4:
                    system.viewAllTasks();
                    System.out.print("Enter task to delete: ");
                    String name1=scanner.nextLine();
                    system.deleteTask(name1);
                    break;

                case 5:
                    System.out.print("Enter task name to search: ");
                    String searchName = scanner.nextLine();
                    system.searchTask(searchName);
                    break;

                case 6:
                    System.out.println("Exiting the system...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
	}

}
