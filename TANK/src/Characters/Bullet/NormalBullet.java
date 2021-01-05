package Characters.Bullet;

import javax.swing.ImageIcon;

import Characters.Direction;
import Characters.Speed;
import Characters.getBulletImage;

public class NormalBullet extends Bullet{

    public NormalBullet(int x, int y, Direction dir)
    {
        super(x,y, dir);
        setHp();
        setDamage();
        setImg();
        setSize();
        setSpeed();
        setDir(dir);
    }

	@Override
	public void setDamage() {
		// TODO Auto-generated method stub
		setDamage(1);
	}

	@Override
	public void setSpeed() {
		// TODO Auto-generated method stub
		setSpeed(Speed.FAST);
	}
    
    @Override
    public void setHp() {
        // TODO Auto-generated method stub
        setHp(1);
    }

    @Override
    public void setImg() {
        // TODO Auto-generated method stub
        // ImageIcon ii = new ImageIcon("TANK/src/resource/bullet.png");
        // setImg(ii.getImage());
        setImg(getBulletImage.getImg());
    }

    @Override
    public void setSize() {
        // TODO Auto-generated method stub
        setW(getImg().getWidth(null));
        setH(getImg().getHeight(null));
    }
    
}
