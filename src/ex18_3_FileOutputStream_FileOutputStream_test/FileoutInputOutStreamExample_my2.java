package ex18_3_FileOutputStream_FileOutputStream_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutInputOutStreamExample_my2 {
	public static void main(String[] args) throws IOException {
		 try {
		      File file1 = new File("c:\\example\\koala.jpg");
		      File file2 = new File("c:\\example2\\koala_copy.jpg");
		      
		      FileInputStream fis = new FileInputStream(file1);
		      FileOutputStream fos = new FileOutputStream(file2);
		      
		      int data=0;
		      
		      while((data = fis.read())!=-1) 
		         fos.write(data);
		      
		      fis.close();
		      fos.close();
		      
		      }catch(IOException e) {
		         e.printStackTrace();
		      }


	}
}
