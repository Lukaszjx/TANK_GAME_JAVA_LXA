package Characters;

import java.awt.*;

import Characters.BotTanks.Bot;
import Characters.Props.Obstacles;


public abstract class Sprites {
    private int hp, x, y, w, h;
    private Image img;
    private Direction dir;

    public Sprites(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Direction getDir() {
		return dir;
	}

	public void setDir(Direction dir) {
		this.dir = dir;
	}

	public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
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

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, w, h);
    }
    public Rectangle getBounds(int x, int y) {
        return new Rectangle(x, y, w, h);
    }

    public boolean isCollide(Rectangle r1, Rectangle r2) {
        return r1.intersects(r2);
    }

    public boolean isCollide(Tank original, int newX, int newY){
        Rectangle r1 = getBounds(newX, newY);
        for (Obstacles obstacles : GameObjects.getInstance().getObs()) 
        {
            Rectangle r2 = obstacles.getBounds();
            if (r1.intersects(r2)) return true;
        }
        for (Bot t: GameObjects.getInstance().getBots()) 
        {
            if (original != t)
            {
                Rectangle r2 = t.getBounds();
                if (r1.intersects(r2)) return true;
            }
        }

        // Player cannot run out of board
        if (newX < 10) return true;
        if (newY < 10) return true;
        if (newX > 900 - 50) return true;
        if (newY > 900 - 160) return true;

        return false;
    }

    

    public abstract void setHp();
    public abstract void setImg();
    public abstract void setSize();
}
