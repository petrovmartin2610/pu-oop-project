package figures;
import java.awt.*;

/**
 * @author Martin Petrov
 * Клас Elf, задаващ отделните характеристики на елфите и метод за рендериране
 */
public class Elf extends CommonFigureTraits{
    private int row;
    private int col;
    private static final int tileSize=70;
    Color color=Color.YELLOW;

    public Elf(int row, int col, int attack, int shield, int health, int attackSquares, int speed, boolean alive, String name, Color color) {
        super(row, col, attack, shield, health, attackSquares, speed, alive, name, color);
    }

    public void render(Graphics g) {
        int tileX = this.col * tileSize;
        int tileY = this.row * tileSize;
        g.setColor(this.color);
        g.drawString("E",95,105);
        g.fillRect(tileX, tileY, tileSize, tileSize);
    }


}
