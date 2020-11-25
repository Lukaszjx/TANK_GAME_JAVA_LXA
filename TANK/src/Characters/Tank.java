package Characters;

import java.awt.*;

// THE TANK ABOVE ALL
public abstract class Tank extends Sprites {

    public Tank(int x, int y) {
        super(x,y);
    }

    public abstract Image getImg();
}
