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
        int newX = 0, newY = 0;        
        switch (this.getDir())
        {
            case DOWN: 
                {
                    newX = (int) (width/2) + this.getX() - 10;
                    newY = (int) (height) + this.getY();
                    break;
                }
            case UP:
                {
                    newX = (int) (width/2) + this.getX() - 10;
                    newY = (int) this.getY() - 25;
                    break;
                }
            case LEFT:
                {
                    newX = (int) this.getX() - 25;
                    newY = (int) (height/2) + this.getY() - 10;
                    break;
                }
            case RIGHT:
                {
                    newX = (int) (width) + this.getX() + 5;
                    newY = (int) height/2 + this.getY() - 10;
                }

        }

        
        Bullet bullet = new NormalBullet(newX, newY, getDir());
        bullets.add(bullet);
    }

    public ArrayList<Bullet> getBullets(){
        return bullets;
    }
    public void setBullets(ArrayList<Bullet> list)
    {
        this.bullets = list;
    }

}
