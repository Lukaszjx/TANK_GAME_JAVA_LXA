package Characters;

import java.awt.Rectangle;
import java.util.ArrayList;

import Characters.Bullet.*;

// THE TANK ABOVE ALL
public abstract class Tank extends Sprites {
    private ArrayList<Bullet> bullets = new ArrayList<>();
    public Tank(int x, int y) {
        super(x, y, Direction.DOWN);
    }

    public void fire() {
        Rectangle bound = this.getBounds();
        int width = (int) bound.getWidth();
        int height = (int) bound.getHeight();
        int newX = (int) (bound.getWidth()/2) + this.getX();
        int newY = (int) (bound.getHeight()) + this.getY();

        
        Bullet bullet = new NormalBullet(newX, newY, getDir());
        System.out.println("new bullet created");
        bullets.add(bullet);
    }

    public ArrayList<Bullet> getBullets(){
        return bullets;
    }

}
