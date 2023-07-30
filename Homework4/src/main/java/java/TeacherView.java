package java;

import java.util.List;

public class TeacherView implements UserView<Teacher>{
    @Override
    public void sendOnConsole(List<Teacher> listT) {
        for (Teacher teacher: listT) {
            System.out.println(teacher.getTeacherId());
        }
    }
}
