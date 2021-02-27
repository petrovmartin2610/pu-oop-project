package figures;

public class Dwarf extends CommonFigureTraits{
    public Dwarf(int attack, int shield, int health, int attackSquares, int speed, boolean alive) {
        super(attack, shield, health, attackSquares, speed, alive);
        attack=6;
        shield=2;
        health=12;
        attackSquares=2;
        speed=2;
        alive=true;
    }
}
