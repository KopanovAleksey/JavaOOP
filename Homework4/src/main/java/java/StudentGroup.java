package java;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable {
    private Teacher teacher;
    private List<Student> students;

    public  StudentGroup(Teacher teacher, List<Student> students){
        this.teacher = teacher;
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student student){
        if (students!= null) {
            students.add(student);
        }
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                '}';
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
