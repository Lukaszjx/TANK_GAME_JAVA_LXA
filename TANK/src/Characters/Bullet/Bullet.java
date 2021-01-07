package Characters.Bullet;

import Characters.Direction;
import Characters.Speed;
import Characters.Sprites;
import Characters.Base.Base;
import Characters.BotTanks.Bot;
import Characters.PlayerTank.Player;
import Characters.Props.Obstacles;

import java.awt.Graphics;
import java.awt.Rectangle;
public abstract class Bullet extends Sprites {

    private int damage;
    private Speed speed;
    private int loopCount = 0;

    public Bullet(int x, int y, Direction dir) {
        super(x, y, dir);
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
    public boolean isHit(Bot bot) {
        Rectangle r1 = this.getBounds();
        Rectangle r2 = bot.getBounds();
        return isCollide(r1,r2);
    }
    public boolean isHit(Player player) {
        Rectangle r1 = this.getBounds();
        Rectangle r2 = player.getBounds();
        return isCollide(r1,r2);
    }
    public boolean isHit(Obstacles ob) {
        Rectangle r1 = this.getBounds();
        Rectangle r2 = ob.getBounds();
        return isCollide(r1,r2);
    }

	public boolean isHit(Base base) {
		Rectangle r1 = this.getBounds();
        Rectangle r2 = base.getBounds();
        return isCollide(r1, r2);
	}


    public abstract void setDamage();
    public abstract void setSpeed();

    
}
