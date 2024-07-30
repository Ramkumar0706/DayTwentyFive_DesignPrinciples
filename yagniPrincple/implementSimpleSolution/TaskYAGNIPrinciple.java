package yagniPrincple.implementSimpleSolution;

import java.time.LocalDateTime;

public class TaskYAGNIPrinciple {
    private String name;
    private boolean isCompleted;
    private LocalDateTime completionTime;

    public TaskYAGNIPrinciple(String name) {
        this.name = name;
        this.isCompleted = false;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
        this.completionTime = LocalDateTime.now();
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public LocalDateTime getCompletionTime() {
        return completionTime;
    }

    @Override
    public String toString() {
        return name + (isCompleted ? " [Completed at " + completionTime + "]" : " [Pending]");
    }

    public static void main(String[] args) {
        TaskYAGNIPrinciple task = new TaskYAGNIPrinciple("Finish project report");
        System.out.println(task); // Output: Finish project report [Pending]
        task.markAsCompleted();
        System.out.println(task); // Output: Finish project report [Completed at 2024-07-29T10:15:30]
    }
}

