package Characters.Base;

import java.awt.Graphics;

import Characters.Direction;
import Characters.Sprites;
import Characters.getImage.getBaseImage;

public class Base extends Sprites {

    public Base(int x, int y){
        super(x,y,Direction.DOWN);
        setHp();
        setImg();
        setSize();
    }
    @Override
    public void setHp() {
        // TODO Auto-generated method stub
        setHp(1);
    }

    @Override
    public void setImg() {
        // TODO Auto-generated method stub
        setImg(getBaseImage.getImg());
    }

    @Override
    public void setSize() {
        // TODO Auto-generated method stub
        setW(getImg().getWidth(null));
        setH(getImg().getHeight(null));
    }
    public void draw(Graphics g){
        g.drawImage(getImg(), getX(), getY(), null);
    }
    
    
}
