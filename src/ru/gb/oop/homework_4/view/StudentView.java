package ru.gb.oop.homework_4.view;

import ru.gb.oop.homework_4.data.Student;

import java.util.List;

public class StudentView implements UserViewInterface<Student> {
    @Override
    public void sendOnConsole(List<Student> listT){
        System.out.println("Список студентов: ");

        int i = 1;
        for (Student t: listT) {
            System.out.println(String.format("%d) %d",i,t.getStudentId()));
            i++;
        }
    }
}
