package service;

import model.Student;
import model.Teacher;
import model.Type;
import model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DataService  {
    private List<User> users = new ArrayList<>();

    public void create(String firstName, String secondName, String lastName, Date birthDate, Type type){
        if (Type.STUDENT == type){
            users.add(new Student(firstName, secondName, lastName, birthDate, getFreeId(type)));
        }
        if (Type.TEACHER == type){
            users.add(new Teacher(firstName, secondName, lastName, birthDate, getFreeId(type)));
        }
    }

    public User getUserId(Type type, int id){
        User resultUser = null;
        boolean isStudent = Type.STUDENT == type;
        for (User user : users){
            if (user instanceof Teacher && !isStudent && ((Teacher)user).getTeacherId() == id){
                resultUser = user;
            }
            if (user instanceof Student && isStudent && ((Student)user).getStudentId() == id){
                resultUser = user;
            }
        }
        return resultUser;
    }

    public List<User> getAllUsers(){
        return users;
    }

    public List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();
        for (User user: users) {
            if (user instanceof Student){
                students.add((Student)user);
            }
        }
        return students;
    }
    public List<Teacher> getAllTeachers(){
        List<Teacher> teachers = new ArrayList<>();
        for (User user: users) {
            if (user instanceof Teacher){
                teachers.add((Teacher) user);
            }
        }
        return teachers;
    }

    private int getFreeId(Type type){
        boolean isStudent = Type.STUDENT == type;
        int lastId = 1;
        for (User user : users) {
            if (user instanceof Teacher && !isStudent) {
                lastId = ((Teacher) user).getTeacherId() + 1;
            }
            if (user instanceof Student && isStudent) {
                lastId = ((Student) user).getStudentId() + 1;
            }
        }
        return lastId;
    }
}
