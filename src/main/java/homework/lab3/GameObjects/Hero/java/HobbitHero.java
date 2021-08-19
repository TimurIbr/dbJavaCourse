package homework.lab3.GameObjects.Hero.java;

import homework.lab3.GameObjects.Weapon.CryWeapon;
import homework.lab3.GameObjects.Weapon.SwordWeapon;

public class HobbitHero extends BasicHero{

    public HobbitHero(String name){
        super(name);
        this.setHealth(3);
        this.setPower(0);
        this.setWeapon(new CryWeapon());
    }
}
