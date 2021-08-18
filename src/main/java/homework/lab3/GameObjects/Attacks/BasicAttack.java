package homework.lab3.GameObjects.Attacks;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class BasicAttack implements Attack{
    @Setter
    @Getter
    private int healthDown;
    @Setter
    @Getter
    private int powerDown;

}
