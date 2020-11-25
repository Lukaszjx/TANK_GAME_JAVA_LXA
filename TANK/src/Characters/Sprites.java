package Characters;

import java.awt.*;

public abstract class Sprites {
    private int hp, x, y, w, h;
    private Image img;

    public Sprites(int x, int y) {
        this.x = x;
        this.y = y;
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

    public abstract void setHp();
    public abstract void setImg();
    public abstract void setSize();
}
