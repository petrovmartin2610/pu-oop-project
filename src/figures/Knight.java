package figures;
import java.awt.*;
public class Knight extends CommonFigureTraits{
    private int row;
    private int col;

    public Knight(int attack, int shield, int health, int attackSquares, int speed, boolean alive, String name, Color color) {
        super(attack, shield, health, attackSquares, speed, alive, name, color);
        attack=8;
        shield=3;
        health=15;
        attackSquares=1;
        speed=1;
        alive=true;
        name="K";
        color=null;
    }



}
