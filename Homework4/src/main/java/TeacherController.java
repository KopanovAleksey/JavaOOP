package java;

import java.util.List;

public class TeacherController implements UserController<Teacher> {
    private final UserView<Teacher> teacherView = new TeacherView();
    private final TeacherService teacherService = new TeacherService();
    @Override
    public void create(String firstName, String secondName, String lastName) {
        User newUser = new User(firstName, secondName, lastName);
    }
    public void removeTeacherByFIO(String lastName, String secondName, String firstName){
        teacherService.removeTeacher(firstName,secondName,lastName);
    }
    public List<Teacher> getSortedTeacherById(){
        return teacherService.getSortedTeachers();
    }

    public List<Teacher> getSortedTeachersByFIO(){
        return teacherService.getSortedTeacherByFIO();
    }

    public void sendOnConsole(List<Teacher> teachers){
        teacherView.sendOnConsole(teachers);
    }

}
