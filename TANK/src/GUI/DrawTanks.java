package GUI;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import Characters.*;

public class DrawTanks extends JPanel implements KeyListener { // DRAW IMAGE

    private ArrayList<Tank> list = new ArrayList<>();
    private Player player;
    private Direction dir;


    public DrawTanks() {
        
        
        // handle keyboard input for player tank
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        player = new Player(100, 200);
        Tank t2 = new Bot(200, 100);
        list.add(t2);

    }

    @Override
    public void paintComponent(Graphics g){
        // Draw player tank
        g.drawImage(player.getImg(), player.getX(), player.getY(), null);

        // Draw bot tanks
        for (Tank i: list)
            g.drawImage(i.getImg(), i.getX(), i.getY(), null);
    }


    // Functions to handle keyboard inputs
    public void keyPressed(KeyEvent e) {
        
        Direction d = ArrowKey.handleArrow(e);
        if (d == null) 
            d = WASDKey.handleWASD(e);

        if (d != null)
        {
            setDir(d);
            // Move tank player by direction d
            Move.MoveTank(player, d);
            repaint();
        }
    }
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    // Getters and Setters
    public Direction getDir() {
        return dir;
    }

    public void setDir(Direction dir) {
        this.dir = dir;
    }

    public ArrayList<Tank> getList() {
        return list;
    }

}

