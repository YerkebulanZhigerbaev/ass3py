package com.company;

public class Main {

    public static void main(String[] args) {

        Teacher teacher = new AssociateProfessorDecorator(new PhdDecorator(new MasterDegree()));
        System.out.println(teacher.educate());
    }
}
