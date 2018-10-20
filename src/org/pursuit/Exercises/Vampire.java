package org.pursuit.Exercises;

public class Vampire extends Monster {

    private static String weakness;

    public Vampire() {
    }

    public Vampire(String food, String habitat, String attackWeapons, String weakness) {
        super(food, habitat, attackWeapons);
        this.weakness = weakness;
    }


    public static String getWeakness() {
        return weakness;
    }

    public static void setWeakness(String weakness) {
        Vampire.weakness = weakness;
    }
}
