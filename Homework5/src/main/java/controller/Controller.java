package controller;

import model.Student;
import model.StudentGroup;
import model.Teacher;
import model.Type;
import service.DataService;
import service.StudentGroupService;
import view.StudentGroupView;
import view.StudentView;

import java.util.Date;
import java.util.List;
import java.util.Random;

public class Controller {
    Random random = new Random();
    DataService dataService = new DataService();
    StudentView view = new StudentView();
    StudentGroupService studentGroupService = new StudentGroupService();
    StudentGroupView studentGroupView = new StudentGroupView();

    public void createStudent(String firstName, String secondName, String lastName, Date birthDate){
        dataService.create(firstName,secondName,lastName,birthDate, Type.STUDENT);
    }
    public void createTeacher(String firstName, String secondName, String lastName, Date birthDate){
        dataService.create(firstName,secondName,lastName,birthDate, Type.TEACHER);
    }

    public void getAllStudents() {
        List<Student> students = dataService.getAllStudents();
        for (Student user: students) {
            view.printOnConsole(user);
        }
    }

    public void getStudentGroup(){
        List<Student> students = dataService.getAllStudents();
        List<Teacher> teachers = dataService.getAllTeachers();
        Teacher teacher = teachers.get(teachers.size() > 1 ? random.nextInt(0, teachers.size() - 1): 0);
        StudentGroup studentGroup = studentGroupService.createStudentGroup(teacher, students);
        studentGroupView.printOnConsole(studentGroup);
    }
}
