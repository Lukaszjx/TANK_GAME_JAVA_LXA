import javax.swing.*;
import java.awt.*;

public class SplashScreen extends JWindow{
    Image splashscreen;
    ImageIcon img;

    public SplashScreen(){
        splashscreen = Toolkit.getDefaultToolkit().getImage("src/treodaudebanthitcho.jpg");


        img = new ImageIcon(splashscreen);

        //SetSize
        setSize(img.getIconWidth(),img.getIconHeight());
        
        //Get current screensize
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        int x = (screenSize.width-getSize().width)/2;
        int y = (screenSize.height-getSize().height)/2;

        this.setLocation(x,y);

        this.setVisible(true);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(splashscreen, 0, 0, this);
    }
}