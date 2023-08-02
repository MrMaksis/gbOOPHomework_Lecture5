package ru.gb.oop.homework_4.controller;

import ru.gb.oop.homework_4.data.Student;
import ru.gb.oop.homework_4.data.StudentGroup;
import ru.gb.oop.homework_4.data.Teacher;
import ru.gb.oop.homework_4.service.StudentGroupService;

import java.util.List;

public class Controller {
    private StudentGroupService studyGroupService;

    public Controller(StudentGroupService studyGroupService) {
        this.studyGroupService = studyGroupService;
    }

    public StudentGroup formStudyGroup(Teacher teacher, List<Student> students) {
        return studyGroupService.createStudentGroup(teacher, students);
    }
}
