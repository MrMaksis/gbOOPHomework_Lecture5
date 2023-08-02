package ru.gb.oop.homework_4.view;

import ru.gb.oop.homework_4.data.Teacher;

import java.util.List;

public interface TeacherViewInterface<T extends Teacher> {
    public void sendOnConsole(List<T> tList);
}
