import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class DrawTanks extends JPanel{  // DRAW IMAGE
    
    private ArrayList<Tank> list = new ArrayList<>();

    public DrawTanks() {
        Tank t1 = new Player(100, 200);
        Tank t2 = new Bot(200, 100);
        list.add(t1);
        list.add(t2);
        setPreferredSize(new Dimension(100,200));
    }
    
    @Override
    public void paint(Graphics g){
        for (Tank i: list)
            g.drawImage(i.getImg(), i.getX(), i.getY(), null);
    }

}

