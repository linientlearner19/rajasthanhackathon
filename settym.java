package ourprojecthackathon;

import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

public class settym {
  Toolkit toolkit;

  Timer timer;
  TimerTask task;

  public settym(int seconds) {
    toolkit = Toolkit.getDefaultToolkit();
    timer = new Timer();
    
    timer.schedule(new RemindTask(), 0,1000);
   
  }

  class RemindTask extends TimerTask {
    public void run() {
    	System.out.print("nimisha");
      //System.out.println("Time's up!");
      toolkit.beep();
      //timer.cancel(); //Not necessary because we call System.exit
      System.exit(0); //Stops the AWT thread (and everything else)
    }
  }

  public static void main(String args[]) {
    System.out.println("About to schedule task.");
    new settym(5);
    System.out.println("Task scheduled.");
  }
}
           
         