package Characters;

import java.util.ArrayList;

import Characters.Bullet.*;

// THE TANK ABOVE ALL
public abstract class Tank extends Sprites {
    private ArrayList<Bullet> bullets = new ArrayList<>();
    public Tank(int x, int y) {
        super(x, y);
    }

    public void fire() {
        Bullet bullet = new NormalBullet(getX(), getY(), getDir());
        System.out.println("new bullet created");
        bullets.add(bullet);
    }

    public ArrayList<Bullet> getBullets(){
        return bullets;
    }

}
