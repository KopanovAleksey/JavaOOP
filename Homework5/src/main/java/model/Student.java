package model;

import java.util.Date;

public class Student extends User{
    private Integer studentId;
    public Student(String firstName, String secondName, String lastName, Date birthDate, Integer studentId) {
        super(firstName, secondName, lastName, birthDate);
        this.studentId = studentId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + studentId + + '\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName()+ '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", birthDate=" + super.getBirthDate() +
                "}\t\n";
    }
}
