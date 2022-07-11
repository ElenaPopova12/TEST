public class Task {
    private String name;
    boolean IsDone;

    public Task(String name, boolean isDone) {
        this.name = name;
        IsDone = isDone;
    }

    public String getName() {
        return name;
    }

    public void setDone(boolean done) {
        IsDone = done;
    }
}
