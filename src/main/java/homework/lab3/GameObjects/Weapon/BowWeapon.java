package homework.lab3.GameObjects.Weapon;

import homework.lab3.GameObjects.Attacks.Attack;
import homework.lab3.GameObjects.Attacks.BasicAttack;
import homework.lab3.GameObjects.Hero.java.BasicHero;

public class BowWeapon implements Weapon{
    @Override
    public Attack createAttack(BasicHero hero) {
        BasicAttack attack = new BasicAttack();
        attack.setHealthDown(0);
        attack.setPowerDown(1);
        return attack;
    }
}
