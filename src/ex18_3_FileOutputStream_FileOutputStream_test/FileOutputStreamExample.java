package ex18_3_FileOutputStream_FileOutputStream_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
	public static void main(String[] args) {
		String origialFileName = "c://example/koala.jpg";
		String targetFileName = "c://example2/koala.jpg";
		FileInputStream fis = null;
		FileOutputStream fos = null;
			
		try {
			fis = new FileInputStream(origialFileName);
			fos = new FileOutputStream(targetFileName);
			
			int readCount;
			byte[] readBytes = new byte[1024];
			
			while (true) {
				readCount = fis.read(readBytes);
				if(readCount==-1)
					break;
				//fos.write(readBytes, 0, readCount);
			}
			System.out.println("복사가 잘~  되었습니다.");
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {// Exception - IOException
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			try {
				if(fis !=null)
					fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if(fos !=null)
					fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
				
			}
	}
}
