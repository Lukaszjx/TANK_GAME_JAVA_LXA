package Characters.Bullet;
import Characters.Speed;
import Characters.Sprites;
import java.awt.Graphics;
public abstract class Bullet extends Sprites {

    private int damage;
    private Speed speed;
    private int loopCount = 0;

    public Bullet(int x, int y) {
        super(x, y);
    }

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void move() {
        int newX = getX() + getDir().getDeltaX();
        int newY = getY() + getDir().getDeltaY();
        setX(newX);
        setY(newY);
    }

    public void draw(Graphics g){
        g.drawImage(getImg(), getX(), getY(), null);
        loopCount++;
        if (loopCount == getSpeed().getDelta())
        {
            move();
            loopCount = 0;
        }

    }
    public abstract void setDamage();
    public abstract void setSpeed();
    
}
