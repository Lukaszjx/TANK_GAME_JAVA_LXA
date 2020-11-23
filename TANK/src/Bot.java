import javax.swing.*;
import java.awt.*;

// Build-Operate-Transfer (BOT)
public class Bot extends Tank {
    private Image img;

    public Bot(int x, int y){
        super(x, y);
        ImageIcon ii = new ImageIcon("TANK/src/resource/EnemyTank.png");
        img=ii.getImage();
    }

    public Image getImg(){
        return img;
    }
    public String toString() {
        return "this is a Bot tank";
    }
}
