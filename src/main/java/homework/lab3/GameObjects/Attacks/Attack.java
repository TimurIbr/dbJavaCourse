package homework.lab3.GameObjects.Attacks;

public interface Attack {
    public int getHealthDown();
    public int getPowerDown();
    public void setHealthDown(int healthDamage);
    public void setPowerDown(int powerDamage);
}
