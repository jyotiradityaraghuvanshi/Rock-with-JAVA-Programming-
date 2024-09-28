package Project;

import java.util.ArrayList;
import java.util.Scanner;

class Task {
    String description;
    boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return (isCompleted ? "[x] " : "[ ] ") + description;
    }
}

public class ToDoList {
    private ArrayList<Task> al;

    public ToDoList() {
        al = new ArrayList<>();
    }

    public void addTask(String description) {
        al.add(new Task(description));
    }

    public void removeTask(int index) {
        al.remove(index);
    }

    public void markTaskAsCompleted(int index) {
        al.get(index).markAsCompleted();
    }

    public void displayTasks() {
        for (int i = 0; i < al.size(); i++) {
            System.out.println(i + ": " + al.get(i));
        }
    }

    public static void main(String[] args) {
        ToDoList todoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Task\n2. Remove Task\n3. Mark Task Completed\n4. View Tasks\n5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            switch (choice) {
                case 1:
                    System.out.println("Enter task description:");
                    String description = scanner.nextLine();
                    todoList.addTask(description);
                    break;
                case 2:
                    System.out.println("Enter task index to remove:");
                    int removeIndex = scanner.nextInt();
                    todoList.removeTask(removeIndex);
                    break;
                case 3:
                    System.out.println("Enter task index to mark as completed:");
                    int completeIndex = scanner.nextInt();
                    todoList.markTaskAsCompleted(completeIndex);
                    break;
                case 4:
                    todoList.displayTasks();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}




















