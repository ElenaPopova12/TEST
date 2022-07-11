import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Group {
    private Student headman;
    private Task task;
    private List<Student> students;

    public Group(Student headman, Task task) {
        this.headman = headman;
        this.task = task;
        students = new LinkedList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public void setHeadman(Student headman) {
        this.headman = headman;
    }

    public void renameSudentById(String name, int id) {
        Iterator<Student> iterator = students.iterator();

        while ((iterator.hasNext())) {
            Student student = iterator.next();

            if (student.getStudentId() == id) {
                student.setLastName(name);
            }
        }
    }


    public void removeSudentById(int id) {
        Iterator<Student> iterator = students.iterator();

        while ((iterator.hasNext())) {
            Student student = iterator.next();

            if (student.getStudentId() == id) {
                iterator.remove();
            }
        }
    }

    public void statusTaskForStudent(int studentId) {
        Iterator<Student> iterator = students.iterator();

        while ((iterator.hasNext())) {
            Student student = iterator.next();
            if (student.getStudentId() == studentId){
                List<Task> tasks = student.getTasks();
                Iterator<Task> taskIterator = tasks.iterator();

                while (taskIterator.hasNext()){
                    Task t = taskIterator.next();

                    if(t.getName().equals(task.getName())){
                        t.setDone(true);
                    }
                }
            }

        }
    }
}