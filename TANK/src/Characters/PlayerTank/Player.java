package Characters.PlayerTank;

import java.awt.event.*;

import javax.swing.*;
import java.awt.Graphics;
import Characters.Direction;
import Characters.Tank;


// PLAYER TANK
public class Player extends Tank {
    public Player(int x, int y) {
        super(x, y);
        setImg();
        setSize();
    }

    public void draw(Graphics g){
        g.drawImage(getImg(), getX(), getY(), null);
    }

    public void setSize() {
        super.setW(getImg().getWidth(null));
        super.setH(getImg().getHeight(null));
    }


    public void keyPressed(KeyEvent e) {

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
            
            if (isCollide(this, newX, newY)){
                newX = getX();
                newY = getY();
            }
            setX(newX);
            setY(newY);
        }
    }
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    @Override
    public void setHp() {
        // TODO Auto-generated method stub
        super.setHp(5);
    }

    @Override
    public void setImg() {
        ImageIcon ii = new ImageIcon("TANK/src/resource/PlayerTank.gif");
         setImg(ii.getImage());
    }

}
