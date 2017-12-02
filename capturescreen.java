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

import javax.imageio.ImageIO;



public class capturescreen {
	 
    public static void main(String[] args) {
    	
    		
    	while(7<9){
        try {
            Robot robo = new Robot();
            String ext = "jpg";
            String s=returningdate();
            String fileName = "F:\\softwarestorage\\"+s+"." + ext;
            
             
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage screenFullImage = robo.createScreenCapture(screenRect);
            ImageIO.write(screenFullImage, ext, new File(fileName));
             
           // System.out.println(" screenshot der!");
        } 
        catch (AWTException e )
        {
        	System.err.println(e);
        }
       catch( IOException ex) {
            ex.printStackTrace();
        }
    
    
    try{
    	Thread.sleep(5000);
    	
    }
    catch(InterruptedException e){
    	e.printStackTrace();
    }}
    
}public static String returningdate()
    {
    	DateFormat dateF=new SimpleDateFormat("yyyysMMdd");
    	DateFormat dateF1=new SimpleDateFormat("hh mm ss");
    	
    	Date date=new Date();
    	//System.out.println("dateF.ext(date)");
    	//System.out.println("dateF1.ext(date)");
    	return(dateF.format(date));
    }}
