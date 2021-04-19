package com.company;


class Magic extends Hero{
    public Magic(){
        super.superAbilityType = "MAGIC";
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Magic применил суперспособность " + superAbilityType);
    }
}
