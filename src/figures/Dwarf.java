package figures;
import java.awt.*;

/**
 * @author Martin Petrov
 * Клас Dwarf, задаващ отделните характеристики на джуджетата и метод за рендериране
 */
public class Dwarf extends CommonFigureTraits{
    private int row;
    private int col;
    private static final int tileSize=70;
    Color color=Color.ORANGE;

    public Dwarf(int row, int col, int attack, int shield, int health, int attackSquares, int speed, boolean alive, String name, Color color) {
        super(row, col, attack, shield, health, attackSquares, speed, alive, name, color);
    }

    public void render(Graphics g) {
        int tileX = this.col * tileSize;
        int tileY = this.row * tileSize;
        g.setColor(this.color);
        g.drawString("DW",95,105);
        g.fillRect(tileX, tileY, tileSize, tileSize);
    }

    public static int getTileSize() {
        return tileSize;
    }
}
