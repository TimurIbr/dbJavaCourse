package homework.lab3.GameObjects.Hero.java;

import homework.lab3.GameObjects.Attacks.Attack;
import homework.lab3.GameObjects.Weapon.Weapon;
import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class BasicHero implements Hero{
    @Setter
    private Weapon weapon;
    @Setter
    private int health;
    @Setter
    private int power;
    protected final String name;

    public BasicHero(String name){
        this.name = name;
    }

    public void kick(Hero hero) {
        Attack attack = this.getWeapon().createAttack(this);
        hero.receiveAttack(attack);
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public void receiveAttack(Attack attack) {
        this.setHealth(this.getHealth() - attack.getHealthDown());
        if (this.getPower()>0){
            this.setPower(this.getPower() - attack.getPowerDown());
        }
    }


    public String toString() {
        return this.getName() + " [h " + this.getHealth() + " - " + this.getPower() + " p ]";
    }
}
