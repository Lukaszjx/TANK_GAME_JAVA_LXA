package Characters.Bullet;
import Characters.Speed;
import Characters.Sprites;

public abstract class Bullet extends Sprites {

    private int damage;
    private Speed speed;

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

    public abstract void setDamage();
    public abstract void setSpeed();
    
}
