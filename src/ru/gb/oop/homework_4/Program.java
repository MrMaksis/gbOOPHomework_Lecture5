package ru.gb.oop.homework_4;

import ru.gb.oop.homework_4.controller.Controller;
import ru.gb.oop.homework_4.data.Student;
import ru.gb.oop.homework_4.data.StudentGroup;
import ru.gb.oop.homework_4.data.Teacher;
import ru.gb.oop.homework_4.service.StudentGroupService;
import ru.gb.oop.homework_4.view.StudentView;
import ru.gb.oop.homework_4.view.TeacherView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Teacher> teacher = new ArrayList<>();
        teacher.add(new Teacher("Иванов", "Иван", 12379L));
        teacher.add(new Teacher("Некрылов", "Андрей", 12379L));


        List<Student> students = new ArrayList<>();
        students.add(new Student("Иванов", "Иван","Андреевич",
                LocalDate.of(2000,6,10), 2379L));
        students.add(new Student("Никифоров", "Максим","Валерьевич",
                LocalDate.of(1998,2,12),223L));

        StudentGroupService studyGroupService = new StudentGroupService();
        Controller controller = new Controller(studyGroupService);

        StudentGroup studyGroup = controller.formStudyGroup(teacher.get(0), students);

        StudentView studentView = new StudentView();
        studentView.sendOnConsole(students);

        TeacherView teacherView = new TeacherView();
        teacherView.sendOnConsole(teacher);

    }
}
