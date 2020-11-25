package GUI;

import java.awt.event.*;
import java.util.ArrayList;

import Characters.Obstacles;
import Characters.Player;
import Characters.Tank;

public class KeyAdapter implements KeyListener {
    private Player player;
    private ArrayList<Tank> myTanks;
    private ArrayList<Obstacles> myObs;
    public KeyAdapter(Player player, ArrayList<Tank> tanks, ArrayList<Obstacles> obs) {
        this.player = player;
        this.myTanks = tanks;
        this.myObs = obs;
    }
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        player.keyPressed(e, myTanks, myObs);
        //System.out.println(player.getX() + " " + player.getY());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }
    
}
