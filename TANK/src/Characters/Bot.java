package Characters;

import javax.swing.*;
import java.awt.*;

// Build-Operate-Transfer (BOT)
public class Bot extends Tank {
    private Image img;

    public Bot(int x, int y){
        super(x, y);
        setImg();
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
        img=ii.getImage();
    }
    public Image getImg(){
        return img;
    }
}
