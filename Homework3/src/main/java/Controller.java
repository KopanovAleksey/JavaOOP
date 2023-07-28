import java.util.List;

public class Controller {

    private final StudentGroupService studentGroupService = new StudentGroupService();

    public void removeStudentByFIO(String lastName, String secondName, String firstName){
        studentGroupService.removeStudent(firstName,secondName,lastName);
    }

    public List<Student> getSortedStudentsById(){
        return studentGroupService.getSortedStudents();
    }

    public List<Student> getSortedStudentsByFIO(){
        return studentGroupService.getSortedStudentByFIO();
    }
    private final StreamService streamService = new StreamService();

    public List <Stream> getSortedStreams() {
        return streamService.streamSort();
    }
}
