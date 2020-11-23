import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.*;
public class DrawTanks extends JPanel implements KeyListener { // DRAW IMAGE

    private ArrayList<Tank> list = new ArrayList<>();
    private Player player;
    private Direction dir;


    public DrawTanks() {
        
        
        // handle keyboard input for player tank
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        player = new Player(100, 200);
        Tank t2 = new Bot(200, 100);
        list.add(t2);

    }

    @Override
    public void paintComponent(Graphics g){
        // Draw player tank
        g.drawImage(player.getImg(), player.getX(), player.getY(), null);

        // Draw bot tanks
        for (Tank i: list)
            g.drawImage(i.getImg(), i.getX(), i.getY(), null);
    }


    // Functions to handle keyboard inputs
    public void keyPressed(KeyEvent e) {
        int c = e.getKeyCode();
        //System.out.println(c);
        switch (c) {
            case KeyEvent.VK_LEFT:
                System.out.println("left key pressed");
                setDir(Direction.LEFT);
                break;
            case KeyEvent.VK_RIGHT:
                System.out.println("right key pressed");
                setDir(Direction.RIGHT);
                break;
            case KeyEvent.VK_UP:
                System.out.println("up key pressed");
                setDir(Direction.UP);
                break;
            case KeyEvent.VK_DOWN:
                System.out.println("down key pressed");
                setDir(Direction.DOWN);
                break;
        }
        player.setX(player.getX() + getDir().getDeltaX());
        player.setY(player.getY() + getDir().getDeltaY());
        repaint();
    }
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    // Getters and Setters
    public Direction getDir() {
        return dir;
    }

    public void setDir(Direction dir) {
        this.dir = dir;
    }

    public ArrayList<Tank> getList() {
        return list;
    }

}

