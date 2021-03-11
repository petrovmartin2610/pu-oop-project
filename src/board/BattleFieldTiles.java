package board;
import java.awt.*;

/**
 * @author Martin Petrov
 * Клас BattleFieldТiles, задаващ отделните характеристики на полетата на игралната дъска и метод за рендериране
 */
public class BattleFieldTiles {
    private int row;
    private int col;
    Color color;
    private static final int tileSize=70;

    public BattleFieldTiles(int row, int col, Color color){
        this.row=row;
        this.col=col;
        this.color=color;
    }

    public void render(Graphics g) {
        int tileX = this.col * tileSize;
        int tileY = this.row * tileSize;
        g.setColor(this.color);
        g.fillRect(tileX, tileY, tileSize, tileSize);
    }

    public static int getTileSize() {
        return tileSize;
    }
}
