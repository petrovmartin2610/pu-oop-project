package board;
import java.awt.*;

public class BattleFieldTiles {
    private int row;
    private int col;
    Color color;
    private int tileSize=70;

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

}
