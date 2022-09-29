//File 클래스를 이용하여 파일, 디렉토리 생성 및 삭제 변경
package ex18_10_File;

import java.io.File;

public class FileExample2_4 {
	public static void main(String[] args) {
		//디렉도리 삭제
		/*
		 * boolean java.io.File.delete() : 디렉토리 삭제합니다.
		 * 단 디렉토리 안에 파일이 있으면 삭제하지 못합니다.
		 * 이때 반환값은 false가 됩니다.
		 */
		String dir = "C:\\newDirectory";
		File f3 = new File(dir);
		if(f3.exists()) {
			if(f3.delete()) {// 파일삭제
				System.out.println(f3.getPath() + "삭제했습니다.");
			}else{
				System.out.println(f3.getPath() + "삭제 하지 못했습니다.");
			}
		}else 
		 System.out.println(f3.getPath() + "에 삭제하고자 하는 파일이 없습니다.");
		
	}
}
