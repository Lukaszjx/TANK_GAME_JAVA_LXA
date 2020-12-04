package GUI;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import Characters.*;

public class DrawTanks extends JPanel { // DRAW IMAGE

    private ArrayList<Bot> tanks = new ArrayList<Bot>();
    private ArrayList<Obstacles> obs = new ArrayList<Obstacles>();
    private Player player;

    public DrawTanks() {

        player = new Player(100, 200);

        Bot t2 = new Bot(200, 100);
        Obstacles metal = new MetalCrate(200, 200);
        Obstacles wood = new WoodCrate(300, 300);
        obs.add(metal);
        obs.add(wood);
        tanks.add(t2);

        // handle keyboard input for player tank
        addKeyListener(new KeyAdapter(player, tanks, obs));
        setFocusable(true);
        // setBackground(Color.BLACK);
        JButton b = new JButton("Hello");
        this.add(b);
        setFocusTraversalKeysEnabled(false);
         
        // Controll game cycle
        Timer t = new Timer(5, new ActionListener() {
        int botTimeControl = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO Auto-generated method stub
                botTimeControl++;
                if (botTimeControl >= 20)
                {
                    for (Bot t: tanks) {
                        t.move(tanks, obs);
                   }
                   botTimeControl = 0;
                }
                repaint();
            }

        });
        t.start();
    }

    @Override
    public void paintComponent(Graphics g){
        // Draw player tank
        g.drawImage(player.getImg(), player.getX(), player.getY(), null);

        // Draw bot tanks
        for (Tank i: tanks)
            g.drawImage(i.getImg(), i.getX(), i.getY(), null);

        // Draw obstacles
        for (Obstacles ob: obs) 
            g.drawImage(ob.getImg(), ob.getX(), ob.getY(), null);
    }

    public ArrayList<Bot> getList() {
        return tanks;
    }

}

