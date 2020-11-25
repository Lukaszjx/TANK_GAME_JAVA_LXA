package Characters;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

// PLAYER TANK
public class Player extends Tank {
    private Image img;
    private Direction dir;

    public Player(int x, int y) {
        super(x, y);
        setImg();
        setSize();
    }

    public void setSize() {
        super.setW(img.getWidth(null));
        super.setH(img.getHeight(null));
    }

    public String toString() {
        return "This is player tank";
    }


    public void keyPressed(KeyEvent e, ArrayList<Tank> tanks, ArrayList<Obstacles> obs) {

        System.out.println();
        Direction d = ArrowKey.handleArrow(e);
        if (d == null) 
            d = WASDKey.handleWASD(e);

        if (d != null)
        {
            setDir(d);

            // New position of player
            int newX = getX() + d.getDeltaX();
            int newY = getY() + d.getDeltaY();

            //Check that player cannot run over obstacles and other tanks
            Rectangle pRec = getBounds(newX, newY);
        
            for (Tank t: tanks) {
            
                if (pRec.intersects(t.getBounds()))
                {
                    newX = getX();
                    newY = getY();
                }
            }

            for (Obstacles ob: obs) {
                if (pRec.intersects(ob.getBounds()))
                {
                    newX = getX();
                    newY = getY();
                }
            }

            // Player cannot run out of board
            if (newX < 0) newX = 0;
            if (newY < 0) newY = 0;
            if (newX > 900) newX = 900;
            if (newY > 900) newY = 900;


            setX(newX);
            setY(newY);
        }
    }
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    public Direction getDir() {
        return dir;
    }

    public void setDir(Direction dir) {
        this.dir = dir;
    }

    @Override
    public void setHp() {
        // TODO Auto-generated method stub
        super.setHp(5);
    }

    @Override
    public void setImg() {
        ImageIcon ii = new ImageIcon("TANK/src/resource/PlayerTank.gif");
        img = ii.getImage();
    }

    public Image getImg() {
        return img;
    }
}
