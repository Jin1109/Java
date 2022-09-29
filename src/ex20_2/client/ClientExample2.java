//Ŭ���̾�Ʈ ���α׷�
package ex20_2.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientExample2 {
	public static void main(String[] args) {
		System.out.println("����� Ŭ���̾�Ʈ �Դϴ�.");
		Socket socket = null;
		try {
			socket = new Socket("127.0.0.1",9001);
			
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			
			
			PrintWriter writer = 
					new PrintWriter(socket.getOutputStream());
			
			//�����͸� �۽��մϴ�.
			//println �żҵ� ȣ�� ��� �׵��ũ�� �۽ŵǴ� ���� �ƴ϶� ���۰� �� �߶����� ������ٰ� �Ѳ����� �۽ŵ˴ϴ�.
			//�׷��� ������  println�޼ҵ带 ȣ���� ������ �ٷ� ���ڿ��� �۽ŵǵ��� flush �żҵ带 ȣ���ؾ� �մϴ�.
			writer.println("Hello, Server2");
			writer.flush();
			
			//������ �����մϴ�.
			String str = reader.readLine();
	         
			//���ŵ� �����͸� ����մϴ�.
	        System.out.println(str);
	      
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				socket.close(); //��Ĺ�� �ݽ��ϴ�.
			}catch (Exception e) {
				System.out.println("������ �ݴ� �� ����.");
			}
		}
	}
}
