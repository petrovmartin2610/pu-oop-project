package figures;
import java.awt.*;

public class Dwarf extends CommonFigureTraits{
    private int row;
    private int col;

    public Dwarf(int attack, int shield, int health, int attackSquares, int speed, boolean alive, String name, Color color) {
        super(attack, shield, health, attackSquares, speed, alive, name, color);
        attack=6;
        shield=2;
        health=12;
        attackSquares=2;
        speed=2;
        alive=true;
        name="DW";
        color=null;
    }
}
