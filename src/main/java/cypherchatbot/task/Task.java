package cypherchatbot.task;

public abstract class Task {
    protected String description;
    protected Boolean completed;

    public Task(String desc) {
        this.description = desc.trim();
        this.completed = false;
    }

    public void completeTask() {
        this.completed = true;
    }

    public void incompleteTask() {
        this.completed = false;
    }

    @Override
    public String toString() {
        String str = this.completed ? "[X] " : "[ ] ";
        str += this.description;
        return str;
    }

    public abstract String toStringinFile();
}
