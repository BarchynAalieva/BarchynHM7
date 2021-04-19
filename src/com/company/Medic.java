package com.company;

class Medic extends Hero{
    public Medic() {
        super.superAbilityType = "HEAL";
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Medic применил суперспособность " + superAbilityType);
    }
}
