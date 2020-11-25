package Characters;

import java.awt.event.*;
public class WASDKey {
    public static Direction handleWASD(KeyEvent e){
        int c = e.getKeyCode();
        //System.out.println(c);

        // handle AWSD keys 
        switch (c) {
            case KeyEvent.VK_A:
                System.out.println("A key pressed");
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