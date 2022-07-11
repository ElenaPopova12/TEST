import java.awt.*;
import java.util.ArrayList;
import java.util.List;
public class Student {
      private int studentId;
      private String firstName;
      private String lastName;
      private List<Task> tasks;
      private StudentType type;

    public Student(int StudentId, String firstName, String lastName, StudentType type) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.tasks = new ArrayList<>();
        this.type = type;
    }
    public void addTasks(Task task){
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}


