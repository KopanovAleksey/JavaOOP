package model;

import java.util.Date;

public class Teacher extends User{
    private Integer teacherId;
    public Teacher(String firstName, String secondName, String lastName, Date birthDate, Integer teacherId) {
        super(firstName, secondName, lastName, birthDate);
        this.teacherId = teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + teacherId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", birthDate=" + super.getBirthDate() + '\'' +
                '}';
    }
}
