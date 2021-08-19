package homework.lab3.GameObjects.Hero.java;

import homework.lab3.GameObjects.Weapon.SwordWeapon;

public class KingHero extends BasicHero{
//Todo: add random in stat generation
  public KingHero(String name){
      super(name);
      this.setHealth(5);
      this.setPower(5);
      this.setWeapon(new SwordWeapon());
  }
}
