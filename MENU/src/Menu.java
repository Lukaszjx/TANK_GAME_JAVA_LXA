import java.awt.*;
import javax.swing.*;

public class Menu extends JFrame{
    public Menu(){
        JPanel panel = new JPanel(new FlowLayout());
        // this.setUndecorated(true);
        this.setSize(1280,960);
        this.setTitle("30475 Tanker");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        //ADD TITLE
        JLabel label = new JLabel("30475 TANK");
        label.setFont(new Font("Verdana",1,100));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        // label.setForeground(Color.magenta);

        //Draw Background Image
        JLabel back = new JLabel(new ImageIcon("src/Tank.jpg"));
        back.setLayout(new BoxLayout(back, BoxLayout.Y_AXIS));
        this.add(back);

        //SetButtons
        JButton b1 = new JButton("Start game");
        JButton b2 = new JButton("Close game");

        //Add buttons to the left and with "SPACES"
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        // b1.setSize(50,100);
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        // b2.setSize(100,100);


        //ADDING
        back.add(label);
        back.add(Box.createRigidArea(new Dimension(0,300)));
        back.add(b1);
        back.add(b2);
        back.setSize(1279,959);

    }

    public static void main(String[]args){
        new Menu();
    }
}