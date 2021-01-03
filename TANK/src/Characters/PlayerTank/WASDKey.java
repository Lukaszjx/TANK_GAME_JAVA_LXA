package Characters.PlayerTank;

import java.awt.event.*;

import Characters.Direction;
public class WASDKey {
    public static Direction handleWASD(KeyEvent e){
        int c = e.getKeyCode();
        //System.out.println(c);

        // handle AWSD keys 
        switch (c) {
            case KeyEvent.VK_A:
                return Direction.LEFT;
            case KeyEvent.VK_D:
                return Direction.RIGHT;
            case KeyEvent.VK_W:
                return Direction.UP;
            case KeyEvent.VK_S:
                return Direction.DOWN;
        }
        return null;
    }
}