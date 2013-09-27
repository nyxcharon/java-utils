/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adonis.core.components;

import adonis.core.Installer;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Bobby
 */
public class ImageButton extends JButton
{
    ImageIcon on,off;
    public ImageButton(String offS, Dimension dim)
    {
      //URL offUrl = this.getClass().getClassLoader().getResource(offS);
      URL imageURL = Installer.class.getResource(offS);
      Image myImage = Toolkit.getDefaultToolkit().getImage(imageURL);
      //InputStream is = getClass().getResourceAsStream("car1.png");
      
        
      this.setIcon(new ImageIcon(myImage));
      this.setPreferredSize(dim);
      setContentAreaFilled(false);
    }
    
}
