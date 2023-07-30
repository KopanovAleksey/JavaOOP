package java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TeacherService implements Iterable<Teacher>{
    private List<Teacher> teachers;

    public List<Teacher> getTeachers() {
        return teachers;
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new TeachersIterator(this);
    }

    public void removeTeacher(String firstName, String secondName, String lastName){
        Iterator<Teacher> iterator = this.iterator();
        while (iterator.hasNext()){
            Teacher teacher = iterator.next();
            if (teacher.getFirstName().equals(firstName) && teacher.getSecondName().equals(secondName)&&
                    teacher.getLastName().equals(lastName)){
                iterator.remove();
            }
        }
    }

    public List<Teacher> getSortedTeachers(){
        List<Teacher> teacherList = new ArrayList<>(this.teachers);
        Collections.sort(teacherList);
        return teacherList;
    }

    public List<Teacher> getSortedTeacherByFIO(){
        List<Teacher> teacherList = new ArrayList<>(this.teachers);
        teacherList.sort(new UserComparator<>());
        return teacherList;
    }
}
