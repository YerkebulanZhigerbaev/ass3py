package com.company;

public class TeacherDecorator implements Teacher{

    private Teacher teacher;

    public TeacherDecorator(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String educate() {
        return teacher.educate();
    }
}
