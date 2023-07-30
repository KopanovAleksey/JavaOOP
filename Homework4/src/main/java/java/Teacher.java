package java;

public class Teacher extends User implements Comparable<Teacher>{
    private Integer teacherId;
    public Teacher(Integer teacherId,String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + teacherId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        return this.teacherId.compareTo(o.getTeacherId());
    }
}
