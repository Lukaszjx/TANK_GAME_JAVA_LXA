package Characters;

import javax.swing.ImageIcon;

public class MetalCrate extends Obstacles {

    public MetalCrate(int x, int y) {
        super(x, y);
        setHp();
        setImg();
    }
    @Override
    public void setHp() {
        // TODO Auto-generated method stub
        super.setHp(3);
    }

    @Override
    public void setImg() {
        // TODO Auto-generated method stub
        ImageIcon ii = new ImageIcon("TANK/src/resource/crateMetal.png");
        super.setImg(ii.getImage());
    }
}
