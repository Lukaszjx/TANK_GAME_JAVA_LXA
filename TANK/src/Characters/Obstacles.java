package Characters;

import java.awt.*;

public abstract class Obstacles {
    private int hp, x, y;
    private Image img;

    public Obstacles(int x, int y)
    {
        this.x = x;
        this.y = y;
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

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public abstract void setHp();
    public abstract void setImg();
}
