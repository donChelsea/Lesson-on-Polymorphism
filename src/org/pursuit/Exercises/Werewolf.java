package org.pursuit.Exercises;

public class Werewolf extends Monster{

    private static String transformationTime;

    public Werewolf() {
    }

    public Werewolf(String food, String habitat, String attackWeapons, String transformationTime) {
        super(food, habitat, attackWeapons);
        this.transformationTime = transformationTime;
    }

    public static String getTransformationTime() {
        return transformationTime;
    }

    public static void setTransformationTime(String transformationTime) {
        Werewolf.transformationTime = transformationTime;
    }
}
