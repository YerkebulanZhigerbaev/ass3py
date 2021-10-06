package com.company;

public class AssociateProfessorDecorator extends TeacherDecorator{
    public AssociateProfessorDecorator(Teacher teacher) {
        super(teacher);
    }


    public String guidePhdDoctors(){
        return " Guide PhD candidates.";
    }

    @Override
    public String educate() {
        return super.educate() + guidePhdDoctors();
    }

}
