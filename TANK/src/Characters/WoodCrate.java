package Characters;

import javax.swing.*;

public class WoodCrate extends Obstacles {
    public WoodCrate(int x, int y) {
        super(x, y);
        setHp();
        setImg();
        setSize();
    }
    @Override
    public void setHp() {
        // TODO Auto-generated method stub
        super.setHp(1);
    }

    @Override
    public void setImg() {
        // TODO Auto-generated method stub
        ImageIcon ii = new ImageIcon("TANK/src/resource/crateWood.png");
        super.setImg(ii.getImage());
    }

    @Override
    public void setSize() {
        // TODO Auto-generated method stub
        super.setW(super.getImg().getWidth(null));
        super.setH(super.getImg().getHeight(null));
    }
}
