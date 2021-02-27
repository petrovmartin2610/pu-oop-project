package figures;

public class Elf extends CommonFigureTraits{
    public Elf(int attack, int shield, int health, int attackSquares, int speed, boolean alive) {
        super(attack, shield, health, attackSquares, speed, alive);
        attack=5;
        shield=1;
        health=10;
        attackSquares=3;
        speed=3;
        alive=true;
    }
}
