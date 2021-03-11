package board;
import figures.Dwarf;
import figures.Elf;
import figures.Knight;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.concurrent.ThreadLocalRandom;

public class Battlefield extends JFrame implements MouseListener{
    private Object[][] battleField;
    public int amountOfDwarfs=2;
    public int amountOfElves=2;
    public int amountOfKnights=2;
    public int row;
    public int col;
    Color color;
    Dwarf dw1 = new Dwarf(row,col,6,2,10, 2,2,true,"DW",color);
    Dwarf dw2 = new Dwarf(row,col,6,2,10, 2,2,true,"DW",color);
    Knight k1 = new Knight(row,col,6,2,10, 2,2,true,"K",color);
    Knight k2 = new Knight(row,col,6,2,10, 2,2,true,"K",color);
    Elf e1 = new Elf(row,col,6,2,10, 2,2,true,"E",color);
    Elf e2 = new Elf(row,col,6,2,10, 2,2,true,"E",color);

    public void renderBattleField() {
        this.battleField = new Object[8][10];
        Color color = null;

        row=0;
        col=0;
        for (row = 0; row < 8; row++) {
                if(row%2==0) {
                    for (col = 0; col < 10; col++) {
                        if(col%2==0) {
                            this.battleField[row][col] = new BattleFieldTiles(row, col, Color.WHITE);
                        } else {
                            this.battleField[row][col] = new BattleFieldTiles(row, col, Color.BLACK);
                        }
                    }
                } else {
                    for (col = 0; col < 10; col++) {
                        if(col%2==0) {
                            this.battleField[row][col] = new BattleFieldTiles(row, col, Color.BLACK);
                        } else {
                            this.battleField[row][col] = new BattleFieldTiles(row, col, Color.WHITE);
                        }
                    }
                }
        }
        for(row=2;row<5;row++){
            for(col=0;col<10;col++){
                this.battleField[row][col] = new BattleFieldTiles(row, col, Color.GRAY);
            }
        }
        int numberOfGeneratedObstacles = ThreadLocalRandom.current().nextInt(1, 6);
        for(int i=0; i < numberOfGeneratedObstacles; ++i){
            int obstacleRow = ThreadLocalRandom.current().nextInt(3, 6);
            int obstacleCol = ThreadLocalRandom.current().nextInt(1, 10);
            BattleFieldTiles bt2 = new BattleFieldTiles(row, col, Color.BLACK);
            this.battleField[obstacleRow][obstacleCol]=bt2;
            this.repaint();
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
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 10; col++) {
                BattleFieldTiles bt1 = (BattleFieldTiles) this.getBoardPixel(row, col);
                bt1.render(g);
            }
        }
    }


    private Object getBoardPixel(int row, int col) {
        return this.battleField[row][col];
    }

    private int tileCoordinates(int coordinates) {
        return coordinates / BattleFieldTiles.getTileSize();
    }




    @Override
    public void mouseClicked(MouseEvent e) {
        int row = this.tileCoordinates(e.getY());
        int col = this.tileCoordinates(e.getX());

        if(amountOfDwarfs<=0){
            if(row>1 || col>9){
                System.out.println("You've chosen coordinates outside of the battlefield, try again!");
            } else {
                this.battleField[row][col]=k1;
                amountOfKnights--;
                this.repaint();
            }
            if(row>1 || col>9){
                System.out.println("You've chosen coordinates outside of the battlefield, try again!");
            } else {
                this.battleField[row][col]=k2;
                amountOfKnights--;
                this.repaint();
            }
        }

        if(amountOfKnights<=0){
            if(row>1 || col>9){
                System.out.println("You've chosen coordinates outside of the battlefield, try again!");
            } else {
                this.battleField[row][col]=e1;
                amountOfElves--;
                this.repaint();
            }
            if(row>1 || col>9){
                System.out.println("You've chosen coordinates outside of the battlefield, try again!");
            } else {
                this.battleField[row][col]=e2;
                amountOfElves--;
                this.repaint();
            }
        }

        if(amountOfKnights==0 && amountOfDwarfs==0 && amountOfElves==0){
            System.out.println("You've placed all your figures on the gameboard, click outside the board " +
                    "to switch to PLayer B figure placement");
        }

        System.out.println("Choose game figure coordinates for Player A in order: dwarfs, elfs, knights");
        if(row>1 || col>9){
            System.out.println("You've chosen coordinates outside of the battlefield, try again!");
        } else {
            this.battleField[row][col]=dw1;
            amountOfDwarfs--;
            this.repaint();
        }
        if(row>1 || col>9){
            System.out.println("You've chosen coordinates outside of the battlefield, try again!");
        } else {
            this.battleField[row][col]=dw2;
            amountOfDwarfs--;
            this.repaint();
        }
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
