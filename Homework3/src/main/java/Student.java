import java.util.Objects;

public class Student implements Comparable {
    private Integer id;
    private String firstName;
    private String secondName;
    private String lastName;
    public Student(Integer id, String firstName, String secondName, String lastName){
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.id = id ;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName)
                && Objects.equals(secondName, student.secondName)
                && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int compareTo(Object o) {
        return this.id.compareTo(((Student)o).id);
    }

}
