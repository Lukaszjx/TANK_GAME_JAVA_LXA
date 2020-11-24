package GUI;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import Characters.*;

public class DrawTanks extends JPanel { // DRAW IMAGE

    private ArrayList<Tank> tanks = new ArrayList<Tank>();
    private ArrayList<Obstacles> obs = new ArrayList<Obstacles>();
    private Player player;

    public DrawTanks() {
    
        // Controll game cycle
        Timer t = new Timer(5, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                repaint();
            }

        });
        t.start();


        player = new Player(100, 200);
        // handle keyboard input for player tank
        addKeyListener(new KeyAdapter(player));
        setFocusable(true);
        setBackground(Color.BLACK);
        setFocusTraversalKeysEnabled(false);

        
        Tank t2 = new Bot(200, 100);
        Obstacles metal = new MetalCrate(200, 200);
        Obstacles wood = new WoodCrate(300, 300);
        obs.add(metal);
        obs.add(wood);
        tanks.add(t2);
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

    public ArrayList<Tank> getList() {
        return tanks;
    }

}

