package com.company;

class Warrior extends Hero{

    public Warrior(){
        super.superAbilityType = "CRITICAL DAMAGE";
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Warrior применил суперспособность " + superAbilityType);
    }
}
