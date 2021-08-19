package homework.lab3;

import homework.lab3.GameObjects.Hero.java.Hero;

public class GameManager {
    public void fight(Hero hero1, Hero hero2){
        System.out.println(hero1.getName() + " fights with " + hero2.getName());
        for (int i = 0; hero1.isAlive() && hero2.isAlive() && i < 5; ++i){
            System.out.println("----round " + i + "-----");
            System.out.println(hero1.toString() + "    " + hero2.toString());
            hero1.kick(hero2);
            hero2.kick(hero1);
            System.out.println(hero1.toString() + "    " + hero2.toString());
        }
    }
}
