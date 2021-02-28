package figures;
import java.awt.*;

public class Elf extends CommonFigureTraits{
    private int row;
    private int col;

    public Elf(int attack, int shield, int health, int attackSquares, int speed, boolean alive, String name, Color color) {
        super(attack, shield, health, attackSquares, speed, alive, name, color);
        attack=5;
        shield=1;
        health=10;
        attackSquares=3;
        speed=3;
        alive=true;
        name="E";
        color=null;
    }
}
