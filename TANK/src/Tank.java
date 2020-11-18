import java.awt.*;
import javax.swing.*;

import javax.swing.ImageIcon;

// THE TANK ABOVE ALL
public abstract class Tank {
    private int x;
    private int y;

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract Image getImg();
}
