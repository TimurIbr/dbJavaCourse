package homework.lab3.GameObjects.Weapon;

import homework.lab3.GameObjects.Attacks.Attack;
import homework.lab3.GameObjects.Attacks.BasicAttack;
import homework.lab3.GameObjects.Hero.java.BasicHero;

public class SwordWeapon implements Weapon{
    @Override
    public Attack createAttack(BasicHero hero) {
        BasicAttack attack = new BasicAttack();
        attack.setHealthDown(hero.getPower());
        attack.setPowerDown(0);
        return attack;
    }
}
