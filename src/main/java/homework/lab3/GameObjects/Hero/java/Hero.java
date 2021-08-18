package homework.lab3.GameObjects.Hero.java;

import homework.lab3.GameObjects.Attacks.Attack;

public interface Hero {
    public void kick(Hero hero);
    public boolean isAlive();
    public void receiveAttack(Attack attack);
    public String getName();
    public int getPower();
    public int getHealth();
    public void setPower(int power);
    public void setHealth(int power);
}
