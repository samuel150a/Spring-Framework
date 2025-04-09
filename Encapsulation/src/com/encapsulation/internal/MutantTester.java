package com.encapsulation.internal;

public class MutantTester {
    public void mutantDisp() {
        Mutant mutant = new Mutant();
        System.out.println("MutantNameis" + mutant.getName());
        System.out.println("Poweris" + mutant.getPower());
        System.out.println("Ageis" + mutant.getAge());
        System.out.println("IsHeroin" + mutant.getIsHero());
        System.out.println("Teamin" + mutant.getTeam());

        mutant.setName("Magneto");
        mutant.setPower("Magnetism");
        mutant.setAge(70);
        mutant.setIsHero(false);
        mutant.setTeam("Brotherhood");

        System.out.println("UpdatedMutantNameis" + mutant.getName());
        System.out.println("UpdatedPoweris" + mutant.getPower());
        System.out.println("UpdatedAgeis" + mutant.getAge());
        System.out.println("UpdatedIsHeroin" + mutant.getIsHero());
        System.out.println("UpdatedTeamin" + mutant.getTeam());
    }
}

