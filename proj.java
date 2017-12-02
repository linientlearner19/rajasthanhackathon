         
package ourprojecthackathon;



import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;

public class proj {
static  Toolkit toolkit;

  Timer timer;

  public proj(int seconds) {
    toolkit = Toolkit.getDefaultToolkit();
    timer = new Timer();
    timer.schedule(new remindtask(), seconds * 500);
    System.out.println("going to print");
  }

 


  public static void main(String args[]) {
    System.out.println("About to schedule task.");
    new proj(5);
    System.out.println("Task scheduled.");
  }
}
           



