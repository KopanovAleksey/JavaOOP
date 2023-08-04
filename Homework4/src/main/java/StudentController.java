package java;

import java.util.List;

public class StudentController implements UserController<Student> {
    private final UserView<Student> studentView = new StudentView();
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

    @Override
    public void create(String firstName, String secondName, String lastName) {
        User newUser = new User(firstName, secondName, lastName);
    }

    public void sendOnConsole(List<Student> students){
        studentView.sendOnConsole(students);
    }
}
