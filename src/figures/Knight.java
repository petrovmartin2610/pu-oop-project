package figures;

public class Knight extends CommonFigureTraits{

    public Knight(int attack, int shield, int health, int attackSquares, int speed, boolean alive) {
        super(attack, shield, health, attackSquares, speed, alive);
        attack=8;
        shield=3;
        health=15;
        attackSquares=1;
        speed=1;
        alive=true;
    }


}
