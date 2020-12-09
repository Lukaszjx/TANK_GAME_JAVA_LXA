package Characters.BotTanks;

import Characters.Direction;
import Characters.Speed;
import Characters.Tank;
import Characters.Props.Obstacles;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public abstract class Bot extends Tank {
    private Random rand = new Random();
    private Direction directions[] = Direction.values();
    private final int NumberOfDirections = 4;
    private int fireRate;
    private Speed speed;
    private int countMove = 0;
    private int loopCount = 0;

    public Bot(int x, int y){
        super(x, y);
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
        countMove++;
        if (countMove == fireRate) {
            this.fire();
            countMove = 0;
        }
        setX(newX);
        setY(newY);

    }

    public void draw(Graphics g, ArrayList<Bot> tanks, ArrayList<Obstacles> obs){
        g.drawImage(getImg(), getX(), getY(), null);
        loopCount++;
        if (loopCount == getSpeed().getDelta())
        {
            move(tanks, obs);
            loopCount=0;
        }
    }

    @Override
    public void setHp() {
        // TODO Auto-generated method stub
        super.setHp(1);
    }

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public int getFireRate() {
        return fireRate;
    }

    public void setFireRate(int fireRate) {
        this.fireRate = fireRate;
    }

    public String toString() {
        return "this is a Bot tank";
    }

    @Override
    public abstract void setImg();
    public abstract void setSpeed();
    public abstract void setSize();
    public abstract void setFireRate();
}
