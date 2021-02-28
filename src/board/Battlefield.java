package board;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.concurrent.ThreadLocalRandom;

public class Battlefield extends JFrame implements MouseListener {
    private Object[][] battleField;

    public void renderBattleField() {
        this.battleField = new Object[8][10];
        Color color = null;

        int row=0;
        int col=0;
        for (row = 1; row < 8; row++) {
                if(row%2==0) {
                    for (col = 1; col < 10; col++) {
                        if(col%2==0) {
                            this.battleField[row][col] = new BattleFieldTiles(row, col, color.WHITE);
                        } else {
                            this.battleField[row][col] = new BattleFieldTiles(row, col, color.BLACK);
                        }
                    }
                } else {
                    for (col = 1; col < 10; col++) {
                        if(col%2==0) {
                            this.battleField[row][col] = new BattleFieldTiles(row, col, color.BLACK);
                        } else {
                            this.battleField[row][col] = new BattleFieldTiles(row, col, color.WHITE);
                        }
                    }
                }
        }
        for(row=3;row<6;row++){
            for(col=1;col<10;col++){
                this.battleField[row][col] = new BattleFieldTiles(row, col, color.LIGHT_GRAY);
            }
        }
        int numberOfGeneratedObstacles = ThreadLocalRandom.current().nextInt(1, 6);
        for(int i=0; i < numberOfGeneratedObstacles; ++i){
            int obstacleRow = ThreadLocalRandom.current().nextInt(3, 6);
            int obstacleCol = ThreadLocalRandom.current().nextInt(1, 10);
            BattleFieldTiles bt2 = new BattleFieldTiles(row, col, color.WHITE);
            this.battleField[obstacleRow][obstacleCol]=bt2;
            this.repaint();
        }

        int colBoundary=10;
        int rowBoundary=8;
        for(row=7;row < rowBoundary; row++){
            for(col=1;col<colBoundary; col++){

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
        for (int row = 1; row < 8; row++) {
            for (int col = 1; col < 10; col++) {
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
