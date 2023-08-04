package java;

import java.util.Iterator;
import java.util.List;

public class TeachersIterator implements Iterator{
    private List<Teacher> teacherList;
    private Integer counter;
    public TeachersIterator(TeacherService teacherService){
        this.teacherList = teacherService.getTeachers();
    }
    @Override
    public boolean hasNext() {
        return counter < teacherList.size()-1;
    }

    @Override
    public Object next() {
        if (!hasNext()) return null;
        counter++;
        return teacherList.get(counter);
    }
}
