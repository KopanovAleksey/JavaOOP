import controller.Controller;

import java.sql.Date;
import java.sql.Time;

public class Program {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Яшкин", "Анатолий", "Игоревич", new Date(2000, 6, 25));
        controller.createStudent("Яшкин", "Анатолий", "Игоревич", new Date(2000, 6, 25));
        controller.createStudent("Яшкин", "Анатолий", "Игоревич", new Date(2000, 6, 25));
        controller.createStudent("Яшкин", "Анатолий", "Игоревич", new Date(2000, 6, 25));
        controller.createTeacher("Толстой", "Анатолий", "Игоревич", new Date(2000, 6, 25));
        controller.getStudentGroup();
    }
}
