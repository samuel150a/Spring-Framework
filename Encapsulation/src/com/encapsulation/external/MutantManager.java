package com.encapsulation.external;

import com.encapsulation.internal.Mutant;

public class MutantManager {
    public void manageDisp() {
        Mutant mutant = new Mutant();
        System.out.println("MutantNameis" + mutant.getName());
        System.out.println("Poweris" + mutant.getPower());
        System.out.println("Ageis" + mutant.getAge());
        System.out.println("IsHeroin" + mutant.getIsHero());
        System.out.println("Teamin" + mutant.getTeam());
    }
}
