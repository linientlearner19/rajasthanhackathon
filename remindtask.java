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
import java.util.TimerTask;

import javax.imageio.ImageIO;

class remindtask extends TimerTask {
	Toolkit toolkit;
    public void run() {
    	System.out.print("nimisha");
    	
    	                        try {Robot robot = new Robot(); 
    	            			String format = ".jpeg";
    	            			   String s=returningdate();
    	            				
    	            				String fileName = s + format;
    	            				
    	            				{
    	            					Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
    	            				BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
    	            				ImageIO.write(screenFullImage, format, new File(fileName));
    	            				
    	            				System.out.println("A full screenshot saved in filename"+ fileName);
    	            				}} 
			                       
    	                        catch (IOException ex) {
			                      System.err.println(ex);
		                                               }
    	                        catch (AWTException e) {
			                      e.printStackTrace();
		                                               }
      System.out.println("Time's up!");
      proj.toolkit.beep();
      //timer.cancel(); //Not necessary because we call System.exit
      //System.exit(0); //Stops the AWT thread (and everything else)
    }
                                 public   String returningdate(){
    	                         DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd ");
    	                        // DateFormat dateFormat1 = new SimpleDateFormat("hh mm ss ");
    	
    	                         Date date = new Date();
    	
                                 System.out.println(dateFormat.format(date));
                                 //System.out.println(dateFormat1.format(date));
                                 return (dateFormat.format(date)) ;

                                                               }
    	
  
  
	public static void main(String[] args) {
		new remindtask();

	}

}

