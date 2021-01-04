package GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import Characters.*;
import Characters.BotTanks.*;
import Characters.PlayerTank.*;
import Characters.Props.*;

public class DrawTanks extends JPanel { // DRAW IMAGE

    public DrawTanks() {

        Player player = new Player(100, 200);
        GameObjects.createInstance(player);


        NormalBot t2 = new NormalBot(200, 100);
        MetalCrate metal = new MetalCrate(200, 200);
        WoodCrate wood = new WoodCrate(300, 300);

        GameObjects.getInstance().addBot(t2);
        GameObjects.getInstance().addObs(metal);
        GameObjects.getInstance().addObs(wood);

        // handle keyboard input for player tank
        addKeyListener(new KeyAdapter(GameObjects.getInstance().getPlayer()));
        setFocusable(true);
        setBackground(Color.BLACK);
        setFocusTraversalKeysEnabled(false);
         
        Timer t = new Timer(5, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }

        });
        t.start();
    }

    @Override
    public void paintComponent(Graphics g){
        GameObjects oGameObjects = GameObjects.getInstance();
        oGameObjects.getPlayer().draw(g);
        oGameObjects.drawBots(g);
        oGameObjects.drawObs(g);
        //oGameObjects.getPlayer().drawBullets(g);
        oGameObjects.drawBullets(g);
        oGameObjects.bulletCollision();


    }


}

