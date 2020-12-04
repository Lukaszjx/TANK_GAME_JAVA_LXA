package GUI;

import java.awt.event.*;
import java.util.ArrayList;

import Characters.Bot;
import Characters.Obstacles;
import Characters.Player;

public class KeyAdapter implements KeyListener {
    private Player player;
    private ArrayList<Bot> myTanks;
    private ArrayList<Obstacles> myObs;
    public KeyAdapter(Player player, ArrayList<Bot> tanks, ArrayList<Obstacles> obs) {
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
