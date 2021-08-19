package homework.lab3.GameObjects.Hero.java;

import homework.lab3.GameObjects.Attacks.Attack;
import homework.lab3.GameObjects.Weapon.BowWeapon;
import homework.lab3.GameObjects.Weapon.SwordWeapon;
import homework.lab3.GameObjects.Weapon.Weapon;
import lombok.Getter;
import lombok.Setter;

public class ElfHero extends BasicHero{

    @Getter
    @Setter
    private Weapon secondWeapon;
    public ElfHero(String name){
        super(name);
        this.setHealth(3);
        this.setPower(3);
        this.setWeapon(new SwordWeapon());
        this.setSecondWeapon(new BowWeapon());
    }

    @Override
    public void kick(Hero hero) {
        Attack attack;
        if (this.getPower() > hero.getPower()){
            attack = this.getWeapon().createAttack(this);
        }else{
            attack = this.getSecondWeapon().createAttack(this);
        }
        hero.receiveAttack(attack);
    }
}

