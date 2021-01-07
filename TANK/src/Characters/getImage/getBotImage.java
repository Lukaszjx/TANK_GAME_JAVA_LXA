package Characters.getImage;

import javax.swing.ImageIcon;

public class getBotImage {
	public static ImageIcon[] getImg() {
        // Initiate array
        ImageIcon[] ii = new ImageIcon[]
        {
                new ImageIcon("images/BigRedD.png"),
                new ImageIcon("images/BigRedL.png"),
                new ImageIcon("images/BigRedU.png"),
                new ImageIcon("images/BigRedR.png")
        };
         
        return ii;
	}
}
