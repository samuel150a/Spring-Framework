package com.btm.extenal;

import com.btm.internal.*;

public class PeterHall implements ExamHall, Invigilator, Candident, Security, CCtv
{

    @Override
    public void Foottage() {
        System.out.println("Running in the Footage method after implementation ");

    }

    @Override
    public void Alert() {
        System.out.println("Running in the Alert method after implementation ");

    }

    @Override
    public void Uniform() {
        System.out.println("Running in the Uniform method after implementation ");

    }

    @Override
    public void Verification() {
        System.out.println("Running in the Verification method after implementation ");

    }

    @Override
    public void Silence() {
        System.out.println("Running in the Silence method after implementation ");

    }
}
