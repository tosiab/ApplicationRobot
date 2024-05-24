import java.awt.*;
import java.awt.event.InputEvent;
import javax.imageio.ImageIO;
import java.awt.event.*;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;


public class ApplicationRobot{
    public static void main(String[]args) throws Exception{
        Robot tosia = new Robot();
        tosia.mouseMove(0,1100);
        tosia.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        tosia.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        tosia.delay(500);
        tosia.mouseMove(100,725);
        tosia.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        tosia.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        tosia.delay(500);
        tosia.mouseMove(1150,525);
        tosia.delay(800);
        tosia.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        tosia.delay(800);
        tosia.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        tosia.delay(500);
        tosia.mouseMove(1150,925);
        tosia.delay(800);
        tosia.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        tosia.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        tosia.delay(500);
        tosia.mouseMove(700,100);
        tosia.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        tosia.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        tosia.delay(500);
        tosia.mouseMove(700,200);
        tosia.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        tosia.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle bounds = new Rectangle(screenSize);
        BufferedImage image= tosia.createScreenCapture(bounds); 
        File file = new File("myScreenShot.png");
        ImageIO.write(image,"png", file);
        System.out.println("A screenshot is captured to " + file.getPath()); 



        
      
    }
}