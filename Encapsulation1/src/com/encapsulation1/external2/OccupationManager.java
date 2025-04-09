package com.encapsulation1.external2;
import com.encapsulation1.internal2.Occupation;

public class OccupationManager {
    public void manageDisp() {
        Occupation occupation = new Occupation();
        System.out.println("Titleis" + occupation.getTitle());
        System.out.println("Fieldis" + occupation.getField());
        System.out.println("AverageSalaryis" + occupation.getAverageSalary());
        System.out.println("IsRemoteis" + occupation.getIsRemote());
        System.out.println("RequiredDegreeis" + occupation.getRequiredDegree());
    }
}

