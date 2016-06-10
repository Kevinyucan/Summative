


import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class ImageHelper {
    public static BufferedImage loadImage(String Main){
        BufferedImage img = null;
        try{
            img = ImageIO.read(new File(Main));
        }catch(Exception e){
            e.printStackTrace();
            System.exit(0);
        }
        return img;
    }
}
