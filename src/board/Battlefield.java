package board;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Battlefield extends JFrame implements MouseListener {
    private Object[][] battleField;

    public void renderBattleField() {
        this.battleField = new Object[7][9];
        Color color = null;

        int row=0;
        int col=0;
        for (row = 0; row < 7; row++) {
                if(row%2==0) {
                    for (col = 0; col < 9; col++) {
                        if(col%2==0) {
                            this.battleField[row][col] = new BattleFieldTiles(row, col, color.WHITE);
                        } else {
                            this.battleField[row][col] = new BattleFieldTiles(row, col, color.BLACK);
                        }
                    }
                } else {
                    for (col = 0; col < 9; col++) {
                        if(col%2==0) {
                            this.battleField[row][col] = new BattleFieldTiles(row, col, color.BLACK);
                        } else {
                            this.battleField[row][col] = new BattleFieldTiles(row, col, color.WHITE);
                        }
                    }
                }
        }
        for(row=2;row<5;row++){
            for(col=0;col<9;col++){
                this.battleField[row][col] = new BattleFieldTiles(row, col, color.LIGHT_GRAY);
            }
        }


        this.setSize(1000, 700);
        this.setVisible(true);
        this.setTitle("An epic battle of warriors");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.addMouseListener(this);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int row = 0; row < 7; row++) {
            for (int col = 0; col < 9; col++) {
                BattleFieldTiles bt1 = (BattleFieldTiles) this.getBoardPixel(row, col);
                bt1.render(g);
            }
        }
    }

    private Object getBoardPixel(int row, int col) {
        return this.battleField[row][col];
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


}
