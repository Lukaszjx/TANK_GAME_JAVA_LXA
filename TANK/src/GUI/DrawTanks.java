package GUI;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import Characters.*;
import Characters.BotTanks.*;
import Characters.Bullet.*;
import Characters.PlayerTank.*;
import Characters.Props.*;

public class DrawTanks extends JPanel { // DRAW IMAGE

    private ArrayList<Bot> tanks = new ArrayList<Bot>();
    private ArrayList<Obstacles> obs = new ArrayList<Obstacles>();
    private Player player;
    public DrawTanks() {

        player = new Player(100, 200);

        NormalBot t2 = new NormalBot(200, 100);
        MetalCrate metal = new MetalCrate(200, 200);
        WoodCrate wood = new WoodCrate(300, 300);
        obs.add(metal);
        obs.add(wood);
        tanks.add(t2);

        // handle keyboard input for player tank
        addKeyListener(new KeyAdapter(player, tanks, obs));
        setFocusable(true);
        setBackground(Color.BLACK);
        setFocusTraversalKeysEnabled(false);
         
        // Controll game cycle
        Timer t = new Timer(5, new ActionListener() {
        int botTimeControl = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                // //TODO Auto-generated method stub
                // botTimeControl++;
                // if (botTimeControl >= 200)
                // {
                //     for (Bot t: tanks) {
                //         t.move(tanks, obs);
                //    }
                //    botTimeControl = 0;
                // }
                repaint();
            }

        });
        t.start();
    }

    @Override
    public void paintComponent(Graphics g){
        // Draw player tank
        g.drawImage(player.getImg(), player.getX(), player.getY(), null);

        // Draw bot tanks and bullets
        for (Bot i: tanks)
        {
            // g.drawImage(i.getImg(), i.getX(), i.getY(), null);
            i.draw(g, tanks, obs);
            for (Bullet bullet: i.getBullets())
                g.drawImage(bullet.getImg(), bullet.getX(), bullet.getY(), null);
        }

        // Draw obstacles
        for (Obstacles ob: obs) 
            g.drawImage(ob.getImg(), ob.getX(), ob.getY(), null);

        // Draw bullets

    }

    public ArrayList<Bot> getList() {
        return tanks;
    }

}

