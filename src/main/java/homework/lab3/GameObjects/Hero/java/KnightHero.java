package homework.lab3.GameObjects.Hero.java;

import homework.lab3.GameObjects.Attacks.Attack;
import homework.lab3.GameObjects.Weapon.SwordWeapon;

public class KnightHero extends BasicHero{

  public KnightHero(String name){
      super(name);
      this.setHealth(2);
      this.setPower(2);
      this.setWeapon(new SwordWeapon());
  }
}
