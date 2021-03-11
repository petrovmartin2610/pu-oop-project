package figures;
import java.awt.*;

/**
 * @author Martin Petrov
 * Клас Knight, задаващ отделните характеристики на рицарите и метод за рендериране
 */
public class Knight extends CommonFigureTraits{
    private int row;
    private int col;
    private static final int tileSize=70;
    Color color=Color.BLUE;

    public Knight(int row, int col, int attack, int shield, int health, int attackSquares, int speed, boolean alive, String name, Color color) {
        super(row, col, attack, shield, health, attackSquares, speed, alive, name, color);
    }

    public void render(Graphics g) {
        int tileX = this.col * tileSize;
        int tileY = this.row * tileSize;
        g.setColor(this.color);
        g.drawString("K",95,105);
        g.fillRect(tileX, tileY, tileSize, tileSize);
    }


}
