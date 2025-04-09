package com.encapsulation1.internal2;


public class OccupationTester {
    public void occupationDisp() {
        Occupation occupation = new Occupation();
        System.out.println("Titleis" + occupation.getTitle());
        System.out.println("Fieldis" + occupation.getField());
        System.out.println("AverageSalaryis" + occupation.getAverageSalary());
        System.out.println("IsRemoteis" + occupation.getIsRemote());
        System.out.println("RequiredDegreeis" + occupation.getRequiredDegree());

        occupation.setTitle("Doctor");
        occupation.setField("Healthcare");
        occupation.setAverageSalary(120000);
        occupation.setIsRemote(false);
        occupation.setRequiredDegree("MBBS");

        System.out.println("UpdatedTitleis" + occupation.getTitle());
        System.out.println("UpdatedFieldis" + occupation.getField());
        System.out.println("UpdatedAverageSalaryis" + occupation.getAverageSalary());
        System.out.println("UpdatedIsRemoteis" + occupation.getIsRemote());
        System.out.println("UpdatedRequiredDegreeis" + occupation.getRequiredDegree());
    }
}

