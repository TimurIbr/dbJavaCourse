package homework.lab3.HeroFactory;

import homework.lab3.GameObjects.Hero.java.ElfHero;
import homework.lab3.GameObjects.Hero.java.Hero;
import homework.lab3.GameObjects.Hero.java.HobbitHero;


public class BasicHeroFactory implements HeroFactory{
    //Todo:move names into innterface of constants
    private String[] hobbitNames = new String[]{"notFrodo", "Frodo"};
    private String[] elfNames = new String[]{"notLegalas", "Legagls"};
    private String[] knightNames = new String[]{"notBoromir", "Boromir"};
    private String[] kingNames = new String[]{"notAragon", "Aragon"};
    private int idCounter;

    //Todo: add random in hero generation
    @Override
    public Hero createHero() {
        idCounter +=1;
        String name = knightNames[idCounter % knightNames.length] + " (" + idCounter + ")";
        if (idCounter == 1){
            return new ElfHero(name);
        }else{
            return new HobbitHero(name);
        }

    }

}
