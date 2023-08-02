package ru.gb.oop.homework_4.controller;

import ru.gb.oop.homework_4.data.Teacher;

public interface TeacherControllerInterface<T extends Teacher> {
    void create(String firstName, String secondName, Long teacherID);
}
