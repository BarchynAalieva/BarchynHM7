package com.company;

public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic();
        Warrior warrior = new Warrior();
        Medic medic = new Medic();

        Hero[] heroes = new Hero[]{magic, warrior, medic};
        for (Hero hero: heroes ) {
            hero.applySuperAbility(hero.superAbilityType);
        }
    }
}


