import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Menu_v2 extends JFrame  {
    
    public Menu_v2(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("8-bit tank");
        setSize(800,600);

        //Adding background image
        JLabel back = new JLabel(new ImageIcon("Menu_v2/src/Tank.jpg"));
        back.setLayout(new BoxLayout(back, BoxLayout.Y_AXIS));

        //Adding buttons
        JButton b1 = new JButton("Start game");
        JButton b2= new JButton("Close game");
        
        //Adding action to the button
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                //Adding the file game here
                Window window = new Window();
            }
        });

        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                System.exit(0);
            }
        });

        
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
    
        back.add(b1);
        back.add(b2);

        add(back);
        setVisible(true);
    }    
}