package GUI;

import java.awt.event.*;
import Characters.PlayerTank.Player;


public class KeyAdapter implements KeyListener {
    private Player player;
    public KeyAdapter(Player player) {
	}

	@Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        player.keyPressed(e);
        //System.out.println(player.getX() + " " + player.getY());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }
    
}
