//Ŭ���̾�Ʈ ���α׷�
package ex20_1.client;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample1 {
	public static void main(String[] args) {
		System.out.println("����� Ŭ���̾�Ʈ �Դϴ�.");
		Socket socket = null;
		try {
			//�����ڸ� ȣ���ϸ� �� ������ �ȿ��� ���� ���α׷����� ���� ��û�� ���۵ǰ�
			//�� ��� Ŭ���̾�Ʈ ���α׷��� ���� ���α׷��� ������ �ξ����� �˴ϴ�.
			//��Ĺ�� �����մϴ�.
			socket = new Socket("127.0.0.1",9000);
			 //socket = new Socket("192.168.51.10",9000);
	         //������ ���ſ� ����� �Է� ��Ʈ�� ��ü�� �����ϴ� �޼ҵ�
	         InputStream in = socket.getInputStream();
	         
	         //������ �۽ſ� ����� ��� ��Ʈ�� ��ü�� �����ϴ� �޼ҵ�
	         OutputStream out = socket.getOutputStream();
	         
	         String str = "Hello, Server";
	         //getBytes �޼ҵ�� ���ڿ��� ����Ʈ �迭�� ����� �޼ҵ��Դϴ�.
	         //���ڷ� �Ѱ��� �����͸� �۽��մϴ�.
	         out.write(str.getBytes());
	         
	         byte arr[] = new byte[128];
	         in.read(arr); //�����͸� �����մϴ�.
	         System.out.println(new String(arr));//���ŵ� �����͸� ����մϴ�.
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				socket.close(); //��Ĺ�� �ݽ��ϴ�.
			}catch (Exception e) {
				System.out.println("������ �ݴ� �� ���� �߻��߽��ϴ�.");
			}
		}
	}
}
