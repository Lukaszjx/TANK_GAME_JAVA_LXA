package Characters;

import javax.swing.ImageIcon;

public class Bullet extends Sprites {

    public Bullet(int x, int y, Direction dir){
        super(x,y);
        setHp();
        setImg();
        setSize();
        setDir(dir);
    }

    public void move(){
        while (getHp() > 0){
            
        }
    }
    @Override
    public void setHp() {
        // TODO Auto-generated method stub
        setHp(1);
    }

    @Override
    public void setImg() {
        // TODO Auto-generated method stub
        ImageIcon ii = new ImageIcon("TANK/src/resource/bullet.png");
        setImg(ii.getImage());
    }

    @Override
    public void setSize() {
        // TODO Auto-generated method stub
        setW(getImg().getWidth(null));
        setH(getImg().getHeight(null));
    }
    
}
