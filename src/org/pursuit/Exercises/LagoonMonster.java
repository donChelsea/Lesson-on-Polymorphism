package org.pursuit.Exercises;

public class LagoonMonster extends Monster{

    public LagoonMonster() {
    }

    public LagoonMonster(String food, String habitat, String attackWeapons) {
        super(food, habitat, attackWeapons);
    }

    @Override
    public void whoAmI() {
        System.out.println("I am not a LagoonMonster. I am a Fish God and I heal good people.");
    }
}
