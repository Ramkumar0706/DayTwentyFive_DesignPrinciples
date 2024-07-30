package yagniPrincple.implementSimpleSolution;

public class Task {
    private String name;
    private boolean isCompleted;

    public Task(String name) {
        this.name = name;
        this.isCompleted = false;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    @Override
    public String toString() {
        return name + (isCompleted ? " [Completed]" : " [Pending]");
    }

    public static void main(String[] args) {
        Task task = new Task("Finish project report");
        System.out.println(task); // Output: Finish project report [Pending]
        task.markAsCompleted();
        System.out.println(task); // Output: Finish project report [Completed]
    }
}
