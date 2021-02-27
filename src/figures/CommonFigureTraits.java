package figures;

public abstract class CommonFigureTraits {
    private int attack;
    private int shield;
    private int health;
    private int attackSquares;
    private int speed;
    private boolean alive;

    public CommonFigureTraits(int attack, int shield, int health, int attackSquares, int speed, boolean alive){
        this.attack=attack;
        this.shield=shield;
        this.health=health;
        this.attackSquares=attackSquares;
        this.speed=speed;
        this.alive=alive;
    }
}
