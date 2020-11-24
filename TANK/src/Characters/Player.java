package Characters;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// PLAYER TANK
public class Player extends Tank {
    private Image img;
    private Direction dir;

    public Player(int x, int y) {
        super(x, y);
        setImg();
    }

    public String toString() {
        return "This is player tank";
    }

    public void keyPressed(KeyEvent e) {

        Direction d = ArrowKey.handleArrow(e);
        if (d == null) 
            d = WASDKey.handleWASD(e);

        if (d != null)
        {
            setDir(d);
            // Move tank player by direction d
            setX(getX() + d.getDeltaX());
            setY(getY() + d.getDeltaY());
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
