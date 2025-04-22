package com.btm.extenal;

import com.btm.internal.*;
import com.btm.internal.Class;

public class ClassImple implements Class, Teacher, Principle, School, BMSSchool
{
    @Override
    public void Homework() {
        System.out.println("Running in the Abstract method Homework After implementation");
    }

    @Override
    public void Discipline() {
        System.out.println("Running in the Abstract method Discipline After implementation");
    }

    @Override
    public void Truth() {
        System.out.println("Running in the Abstract method Truth After implementation");
    }

    @Override
    public void Fee() {
        System.out.println("Running in the Abstract method Fee After implementation");
    }

    @Override
    public void Admission() {
        System.out.println("Running in the Abstract method Admission After implementation");
    }
    @Override
    public void Books() {
        System.out.println("Running in the Abstract method Books After implementation");
    }

    @Override
    public void Authority() {
        System.out.println("Running in the Abstract method Authority After implementation");
    }

    @Override
    public void Monitor() {
        System.out.println("Running in the Abstract method Monitor After implementation");
    }

    @Override
    public void maintainence() {
        System.out.println("Running in the Abstract method maintainence After implementation");
    }

    @Override
    public void Teach() {
        System.out.println("Running in the Abstract method Teach After implementation");
    }

    @Override
    public void Question() {
        System.out.println("Running in the Abstract method Question After implementation");
    }
    @Override
    public void quize() {
        System.out.println("Running in the Abstract method quize After implementation");
    }

    @Override
    public void Attendance() {
        System.out.println("Running in the Abstract method Attendance After implementation");
    }

    @Override
    public void Quietness() {
        System.out.println("Running in the Abstract method Quietness After implementation");
    }

    @Override
    public void listening() {
        System.out.println("Running in the Abstract method listening After implementation");
    }
}
