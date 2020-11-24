package Characters;

import java.awt.event.*;
public class ArrowKey {
    public static Direction handleArrow(KeyEvent e) {
        int c = e.getKeyCode();
        //System.out.println(c);

        // handle arrow keys
        switch (c) {
            case KeyEvent.VK_LEFT:
                return Direction.LEFT;

            case KeyEvent.VK_RIGHT:
                return Direction.RIGHT;

            case KeyEvent.VK_UP:
                return Direction.UP;

            case KeyEvent.VK_DOWN:
                return Direction.DOWN;
        }

        return null;
    }
}
