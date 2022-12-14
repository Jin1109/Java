package ex18_6_Bufferend2_flush2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample2 {
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("src/ex18_6_Bufferend2_flush2/output.txt");
			
			//두 번째 인자는 버퍼 사이즈를 의미 - 버퍼에 5개의 무자를 저장할 수 있습니다.
			bw = new BufferedWriter(fw,5);
			
			char arr[] = {'내','꺼','인','1','듯',
                    	  '2','내','꺼','3','아',
                    	  '닌','4','내','꺼','5',
                    	  '같','은','6','너'};
					
			for(int cnt = 0; cnt < arr.length; cnt++)
				bw.write(arr[cnt]);
			
			/*
			 * 버퍼가 있는 데이터를 파일에 즉시 출력하도록 하는 메소드입니다.
			 */
			bw.flush();
		}catch (IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		}
		finally {
			try {
				fw.close(); //아직 버퍼에 남아 있는데 출력 스티림 닫습니다.
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		   
	}
}
