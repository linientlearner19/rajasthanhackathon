package ourprojecthackathon;


import java.io.File;
import java.io.IOException;

public class filepermission
{
    public static void main( String[] args )
    {
    	try {

	      File file = new File("C:\\Users\\NIMISHA\\Desktop\\ImageProcessing_ProjectReport.docx");

	      if(file.exists()){
	    	  System.out.println("Is Execute allow : " + file.canExecute());
		  System.out.println("Is Write allow : " + file.canWrite());
		  System.out.println("Is Read allow : " + file.canRead());
	      }

	      file.setExecutable(false);
	      file.setReadable(true);
	      file.setWritable(false);

	      System.out.println("Is Execute allow : " + file.canExecute());
	      System.out.println("Is Write allow : " + file.canWrite());
	      System.out.println("Is Read allow : " + file.canRead());

	      if (file.createNewFile()){
	        System.out.println("File is created!");
	      }else{
	        System.out.println("File already exists.");
	      }

    	} catch (IOException e) {
	      e.printStackTrace();
	    }
    }
}