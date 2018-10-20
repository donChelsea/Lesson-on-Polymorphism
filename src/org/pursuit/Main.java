package org.pursuit;

import org.pursuit.AlienXenomorph.AlienXenomorph;
import org.pursuit.Exercises.LagoonMonster;
import org.pursuit.Exercises.Monster;
import org.pursuit.Exercises.Vampire;
import org.pursuit.Exercises.Werewolf;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

//        AlienXenomorph alienXenomorph = new AlienXenomorph();
//
//        HumanXenomorph humanXenomorph = new HumanXenomorph();
//
//        AlienXenomorph dogXenomorph = new DogXenomorph();
//
//        AlienXenomorph predatorXenomorph = new PredatorXenomorph();
//
//        alienXenomorph.iAmAXenomorph();    // all the classes have access to these first two methods from the parent class
//        alienXenomorph.acidBlood();
//
//        humanXenomorph.iAmAXenomorph();    // first
//        humanXenomorph.acidBlood();        // second
//        humanXenomorph.walkLikeAHuman();   // third
//
//        // third methods are available to subclasses only
//        // until the instances are created statically using the parent class because parent class cannot reverse inherit methods
//
//        dogXenomorph.iAmAXenomorph();
//        dogXenomorph.acidBlood();
//       // dogXenomorph.walkLikeADog();
//
//        predatorXenomorph.iAmAXenomorph();
//        predatorXenomorph.acidBlood();
//       // predatorXenomorph.biteLikeAPredator();
//
//        HashMap<String, AlienXenomorph> alienMap = new HashMap<>();
//
//        String alienXenomorphString = alienXenomorph.getClass().getSimpleName();
//
//        alienMap.put(alienXenomorphString, alienXenomorph);
//        // static type and the actual object
//        alienMap.put("AlienXenomorph", alienXenomorph);
//        alienMap.put("HumanXenomorph", humanXenomorph);
//        alienMap.put("DogXenomorph", dogXenomorph);
//        alienMap.put("PredatorXenomorph", predatorXenomorph);
//
//
//
//        for (String s : alienMap.keySet()) {
//            alienMap.get(s).iAmAXenomorph();
//            if (alienMap.get(s) instanceof HumanXenomorph) {
//                ((HumanXenomorph) alienMap.get(s)).walkLikeAHuman();  // ensure the dynamic type inherits from the static
//            }
//        }
//
//        // for every key in this map, get the key and run the method on each
//        // entering the key as a string
//        // adding the object instance as the value
//        // running the method for the class (AlienXenomorph) on each instance/each value
//
//        HashSet<AlienXenomorph> alienSet = new HashSet<>();
//
//        alienSet.add(alienXenomorph);
//        alienSet.add(humanXenomorph);
//        alienSet.add(dogXenomorph);
//        alienSet.add(predatorXenomorph);
//
//        // will run all since they are unique
//
//        /*
//        alienSet.add(alienXenomorph);
//        alienSet.add(alienXenomorph);
//        alienSet.add(alienXenomorph);
//        alienSet.add(alienXenomorph);
//
//        will run the first add but ignore the rest because they are not unique (hashset rule)
//        */
//
//        for (AlienXenomorph a: alienSet) {
//            a.iAmAXenomorph();
//        }

        Monster monster = new Monster();
        Vampire vampire = new Vampire();
        Werewolf werewolf = new Werewolf();
        LagoonMonster lagoonMonster = new LagoonMonster();

        HashMap<String, Monster> monsterMap = new HashMap<>();

        monsterMap.put(monster.getClass().getSimpleName(), monster);
        monsterMap.put(vampire.getClass().getSimpleName(), vampire);
        monsterMap.put(werewolf.getClass().getSimpleName(), werewolf);
        monsterMap.put(lagoonMonster.getClass().getSimpleName(), lagoonMonster);

        for (String s: monsterMap.keySet()) {
            monsterMap.get(s).whoAmI();
        }

    }
}
