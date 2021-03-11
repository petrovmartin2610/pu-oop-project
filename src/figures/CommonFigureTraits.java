package figures;
import board.BattleFieldTiles;
import java.awt.*;

/**
 * @author Martin Petrov
 * Клас CommonFigureTraits, задаващ общите характеристики за всички игрални фигурки, които впоследствие го наследяват
 */
public class CommonFigureTraits extends BattleFieldTiles {
    private int row;
    private int col;
    private int attack;
    private int health;
    private int shield;
    private int attackSquares;
    private int speed;
    private boolean alive;
    private String name;
    private static final int tileSize=70;
    Color color;

    public CommonFigureTraits(int row, int col, int attack, int shield, int health, int attackSquares, int speed, boolean alive, String name, Color color) {
        super(row,col,color);
        this.row=row;
        this.col=col;
        this.attack=attack;
        this.shield=shield;
        this.health=health;
        this.attackSquares=attackSquares;
        this.speed=speed;
        this.alive=alive;
        this.name=name;
        this.color=color;
    }

    public void render(Graphics g) {
        int tileX = this.col * tileSize;
        int tileY = this.row * tileSize;
        g.setColor(this.color);
        g.drawString(this.name,95,105);
        g.fillRect(tileX, tileY, tileSize, tileSize);
    }

    public static int getTileSize() {
        return tileSize;
    }
}
