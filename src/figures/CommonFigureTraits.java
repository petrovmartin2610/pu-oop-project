package figures;
import java.awt.*;

public abstract class CommonFigureTraits {
    private int attack;
    private int shield;
    private int health;
    private int attackSquares;
    private int speed;
    private boolean alive;
    private String name;
    Color color;


    public CommonFigureTraits(int attack, int shield, int health, int attackSquares, int speed, boolean alive, String name, Color color){
        this.attack=attack;
        this.shield=shield;
        this.health=health;
        this.attackSquares=attackSquares;
        this.speed=speed;
        this.alive=alive;
        this.name=name;
        this.color=color;
    }
}
