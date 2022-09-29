package ex18_3_FileOutputStream_FileOutputStream_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutInputOutStreamExample_my {
	public static void main(String[] args) throws IOException {
		File file = new File("c:\\example\\koala.jpg");
		File newfile = new File("c:\\example2\\koala_copy.jpg");

		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(newfile);

		int input = 0;

		byte[] data = new byte[1024];

		while ((input = fis.read(data)) != -1) {
			fos.write(data, 0, input);
	
		}

		fis.close();
		fos.close();

	}
}
