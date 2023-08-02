package ru.gb.oop.homework_4.controller;

import ru.gb.oop.homework_4.data.Teacher;
import ru.gb.oop.homework_4.view.TeacherView;
import ru.gb.oop.homework_4.view.TeacherViewInterface;

import java.util.List;

public class TeacherController implements TeacherControllerInterface{
    private final TeacherViewInterface<Teacher> teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, Long teacherID) {
        Teacher newTeacher = new Teacher(firstName, secondName, teacherID);
    }
    public void printConsole(List<Teacher> teacherList){
        teacherView.sendOnConsole(teacherList);
    }
}
