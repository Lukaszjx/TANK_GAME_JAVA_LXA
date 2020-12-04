package Characters;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

// Build-Operate-Transfer (BOT)
public class Bot extends Tank {
    private Random rand = new Random();
    private Direction directions[] = Direction.values();
    private final int NumberOfDirections = 4;

    public Bot(int x, int y){
        super(x, y);
        setImg();
        setSize();
        setDir(directions[rand.nextInt(NumberOfDirections)]);
    }

    public void move(ArrayList<Bot> tanks, ArrayList<Obstacles> obs) {

        int newX = getX() + getDir().getDeltaX();
        int newY = getY() + getDir().getDeltaY();
        while (isCollide(this, newX, newY, tanks, obs))
        {
            setDir(directions[rand.nextInt(NumberOfDirections)]);
            newX = getX() + getDir().getDeltaX();
            newY = getY() + getDir().getDeltaY();
        }
        setX(newX);
        setY(newY);
    }

    public void setSize() {
        super.setW(getImg().getWidth(null));
        super.setH(getImg().getHeight(null));
    }

    public String toString() {
        return "this is a Bot tank";
    }

    @Override
    public void setHp() {
        // TODO Auto-generated method stub
        super.setHp(1);
    }

    @Override
    public void setImg() {
        // TODO Auto-generated method stub
        ImageIcon ii = new ImageIcon("TANK/src/resource/EnemyTank.png");
        setImg(ii.getImage());
    }
}
