public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Elena", "Popova", StudentType.SIMPLE_STUDENT);
        Student student2 = new Student(2, "Alona", "Filimonova", StudentType.HEADMAN);
        Student student3 = new Student(3, "Ivan", "Petrov", StudentType.SIMPLE_STUDENT);
        Student student4 = new Student(4, "Petr", "Ivanov", StudentType.SIMPLE_STUDENT);

        Task task1 = new Task("Writing", false);

        student1.addTasks(task1);
        student4.addTasks(task1);

        Group group = new Group(student2, task1);

        group.setHeadman(student3);

        group.addStudent(student2);
        group.addStudent(student4);

        group.renameSudentById("Sydorov", 4);

        group.removeSudentById(3);


        group.statusTaskForStudent(2);

    }
}
