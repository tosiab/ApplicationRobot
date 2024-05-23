import java.awt.*;
import java.awt.event.InputEvent;

public class ApplicationRobot{
    public static void main(String[]args) throws Exception{
        Robot tosia = new Robot();
        tosia.mouseMove(0,1100);
        tosia.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        tosia.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        tosia.delay(500);
        tosia.mouseMove(100,883);
        tosia.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        tosia.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        tosia.delay(500);
        tosia.mouseMove(1150,525);
        tosia.delay(800);
        tosia.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        tosia.delay(500);
        tosia.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        tosia.delay(500);
        tosia.mouseMove(1150,925);
        tosia.delay(500);
        tosia.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        tosia.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        
      
    }
}