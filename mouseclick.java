package ourprojecthackathon;

import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouseclick implements MouseListener {
        private String newline;

		//where initialization occurs:
        //Register for mouse events on blankArea and the panel.
       // blankArea.addMouseListener(this);
        void addMouseListener(){
        	System.out.println("print");
        }
   

    public void mousePressed(MouseEvent e) {
       saySomething("Mouse pressed; # of clicks: "
                    + e.getClickCount(), e);
    }

    public void mouseReleased(MouseEvent e) {
       saySomething("Mouse released; # of clicks: "
                    + e.getClickCount(), e);
    }

    public void mouseEntered(MouseEvent e) {
       saySomething("Mouse entered", e);
    }

    public void mouseExited(MouseEvent e) {
       saySomething("Mouse exited", e);
    }

    public void mouseClicked(MouseEvent e) {
       saySomething("Mouse clicked (# of clicks: "
                    + e.getClickCount() + ")", e);
    }

   void saySomething(String eventDescription, MouseEvent e) {
        
		/*TextArea.append(eventDescription + " detected on "
                        + e.getComponent().getClass().getName()
                        + "." + newline);*/
	   System.out.println("done dear");
    }
   public static void main(String args[])throws Exception
   {
	   System.out.println("reached in main");
	   new mouseclick();
   }
}
