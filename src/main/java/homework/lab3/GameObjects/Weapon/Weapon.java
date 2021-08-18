package homework.lab3.GameObjects.Weapon;

import homework.lab3.GameObjects.Attacks.Attack;
import homework.lab3.GameObjects.Hero.java.BasicHero;

public interface Weapon {
    //Attack factory
    public Attack createAttack(BasicHero hero);
}
