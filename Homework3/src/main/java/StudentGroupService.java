import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;
    public void removeStudent(String firstName, String secondName, String lastName){
        Iterator<Student> iterator = studentGroup.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.getFirstName().equals(firstName) && student.getSecondName().equals(secondName)&&
                    student.getLastName().equals(lastName)){
                iterator.remove();
            }
        }
    }

    public List<Student> getSortedStudents(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudents());
        Collections.sort(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentByFIO(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudents());
        studentList.sort(new StudentComparator());
        return studentList;
    }
}
