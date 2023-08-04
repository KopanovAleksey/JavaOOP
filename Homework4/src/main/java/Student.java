package java;

import java.util.Objects;

public class Student extends User implements Comparable<Student> {
    private Integer id;

    public Student(Integer id, String firstName, String secondName, String lastName){
        super(firstName, secondName, lastName);
        this.id = id ;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(super.getFirstName(), student.getFirstName())
                && Objects.equals(super.getSecondName(), student.getSecondName())
                && Objects.equals(super.getLastName(), student.getLastName());
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
}
