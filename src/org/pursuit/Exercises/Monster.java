package org.pursuit.Exercises;

public class Monster {

    private static String food;
    private static String habitat;
    private static String attackWeapons;


    public Monster() {
    }

    public Monster(String food, String habitat, String attackWeapons) {
        this.food = food;
        this.habitat = habitat;
        this.attackWeapons = attackWeapons;
    }

    public void whoAmI() {
        System.out.println("I am a " + this.getClass().getSimpleName() + ". I live " + habitat + ". I attack with my " + attackWeapons + ".");
    }


}
