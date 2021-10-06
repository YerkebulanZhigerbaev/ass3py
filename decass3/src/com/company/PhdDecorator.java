package com.company;

public class PhdDecorator extends TeacherDecorator{
    public PhdDecorator(Teacher teacher) {
        super(teacher);
    }

    String checkDiploma(){
        return "Check diploma work of students of Master degree. ";
    }

    @Override
    public String educate() {
        return super.educate() + checkDiploma();
    }


}
