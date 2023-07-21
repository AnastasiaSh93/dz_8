package org.example;
import java.util.ArrayList;
import java.util.List;


public class Student {
    final private int uniqueStudentId;
    final private String studentName;
    final private String studentSurname;

    public Student(int uniqueStudentId, String studentName, String studentSurname) {
        this.uniqueStudentId = uniqueStudentId;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
    }

    public class StudentsGroup {
        private Student classMonitor;
        private final List<Student> studentsList = new ArrayList<>();
        private final List<String> tasksList = new ArrayList<>();

        public StudentsGroup(Student classMonitor) {
            this.classMonitor = classMonitor;
            this.studentsList.add(classMonitor);
        }

        public void changeMonitor(Student classMonitor) {
            if (studentsList.contains(classMonitor)) {
                ;
            }
        }

        public void addStudent(Student student) {
            this.studentsList.add(student);
        }

        public void removeStudent(Student student) {
            if (!student.equals(classMonitor)) {
                this.studentsList.remove(student);
            } else {
                throw new IllegalArgumentException("The monitor cannot be removed from the group.");
            }
        }
        public void addTask(String task) {
            this.tasksList.add(task);
        }
        public void completeTask(int studentId, String task) {
            if (tasksList.contains(task)) {
                tasksList.remove(task);
            }


        }


    }

}
