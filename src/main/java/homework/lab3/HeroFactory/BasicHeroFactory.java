package homework.lab3.HeroFactory;

import homework.lab3.GameObjects.Hero.java.Hero;
import homework.lab3.GameObjects.Hero.java.KnightHero;

import java.util.Arrays;
import java.util.Set;

public class BasicHeroFactory implements HeroFactory{
    private String[] knightNames = new String[]{"notBoromir", "Boromir"};
    private int idCounter;

    @Override
    public Hero createHero() {
        idCounter +=1;
        String name = knightNames[idCounter % knightNames.length] + " (" + idCounter + ")";
        return new KnightHero(name);
    }
}
