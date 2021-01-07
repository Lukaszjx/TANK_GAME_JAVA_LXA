package GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import Characters.*;

public class DrawTanks extends JPanel { // DRAW IMAGE

    public DrawTanks() {

        level2.upload();


        // handle keyboard input for player tank
        addKeyListener(new KeyAdapter(GameObjects.getInstance().getPlayer()));
        setFocusable(true);
        setBackground(Color.BLACK);
        setFocusTraversalKeysEnabled(false);
         
        Timer t = new Timer(5, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // if (!GameObjects.isWin() && !GameObjects.isLose())
                    repaint();
            }

        });
        t.start();
    }

    @Override
    public void paintComponent(Graphics g){

        GameObjects oGameObjects = GameObjects.getInstance();
        if (!GameObjects.isWin() && !GameObjects.isLose()){
            oGameObjects.getPlayer().draw(g);
            oGameObjects.drawBase(g);
            oGameObjects.drawBots(g);
            oGameObjects.drawObs(g);
            //oGameObjects.getPlayer().drawBullets(g);
            oGameObjects.drawBullets(g);
            oGameObjects.bulletCollision();
        }
        else {
            oGameObjects.gameEnd(g);
        }


    }


}

