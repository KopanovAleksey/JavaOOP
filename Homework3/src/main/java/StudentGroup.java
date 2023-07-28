import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable {
    private List<Student> students;
    public StudentGroup(){
        students = new ArrayList<>();
    }
    public  StudentGroup(List<Student> students){
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void add(Student student){
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
