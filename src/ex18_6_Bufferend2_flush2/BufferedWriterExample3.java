package ex18_6_Bufferend2_flush2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample3 {
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("src/ex18_6_Bufferend2_flush2/output.txt");
	
			//�� ��° ���ڴ� ���� ����� �ǹ� - ���ۿ� 5���� ���ڸ� ������ �� �ֽ��ϴ�.
			bw = new BufferedWriter(fw,5);
			
			char arr[] = {'��','��','��','1','��',
                    	  '2','��','��','3','��',
                    	  '��','4','��','��','5',
                    	  '��','��','6','��'};
					
			for(int cnt = 0; cnt < arr.length; cnt++)
				bw.write(arr[cnt]);
			
			/*
			 * ��ó�� �� ���� �������� ���Ͽ� ������ �����͸� ���� �ʽ��ϴ�.
			 * '��','��','��','1','��',
             * '2','��','��','3','��',
             * '��','4','��','��','5',
             * '��','��','6','��'
			 */
			
		}catch (IOException ioe) {
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
		}
		finally {
			try {
				bw.close(); //���� ��� ��Ʈ���� ���������� ���� ��
							//�ڵ����� flush()�޼ҵ帣 ȣ���մϴ�.
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		   
	}
}
