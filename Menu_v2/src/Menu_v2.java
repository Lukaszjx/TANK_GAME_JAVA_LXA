import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Menu_v2 extends JFrame  {
    
    public Menu_v2(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("8-bit tank");
        setSize(900,900);

        //Adding background image
        JLabel back = new JLabel(new ImageIcon("src/Tank.jpg"));
        back.setLayout(new BoxLayout(back, BoxLayout.Y_AXIS));

        //Adding buttons
        JButton b1 = new JButton("Start game");
        JButton b2= new JButton("Close game");
        
        //Adding action to the button
        // b1.addActionListener(new ActionListener(){
        //     @Override
        //     public void actionPerformed(ActionEvent ae){
        //         //Adding the file game here
        //     }
        // });

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

    public static void main(String[]args){
        SplashScreen ss = new SplashScreen();
        try{
            Thread.sleep(5000);
            ss.dispose();
        } catch (Exception e){
            e.printStackTrace();
        }
        new Menu_v2();
    }
    
}