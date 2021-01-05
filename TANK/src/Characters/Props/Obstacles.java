package Characters.Props;

import Characters.Direction;
import Characters.Sprites;
import java.awt.Graphics;

public abstract class Obstacles extends Sprites {

    public Obstacles(int x, int y)
    {
        super(x,y, Direction.DOWN);
    }
    public void draw(Graphics g){
        g.drawImage(getImg(), getX(), getY(), null);
    }
}
