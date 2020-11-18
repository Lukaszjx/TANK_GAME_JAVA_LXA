import java.awt.*;
import javax.swing.*;

// PLAYER TANK
public class Player extends Tank {
    private Image img;

    public Player(int x, int y){
        super(x, y);
        ImageIcon ii = new ImageIcon("src/TankD.gif");
        img = ii.getImage();
    }

    public Image getImg() {
        return img;
    }
}
