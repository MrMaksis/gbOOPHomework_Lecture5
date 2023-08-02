package ru.gb.oop.homework_4.view;

import ru.gb.oop.homework_4.data.Teacher;

import java.util.List;

public class TeacherView implements TeacherViewInterface<Teacher> {
    @Override
    public void sendOnConsole(List<Teacher> teacherList) {
        System.out.println("Список id учитлей: ");

        int i = 1;
        for (Teacher t: teacherList) {
            System.out.println(String.format("%d) %d",i,t.getTeacherId()));
            i++;
        }
    }
}
