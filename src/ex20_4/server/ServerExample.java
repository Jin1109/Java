//���� Ǫ�α׷�
//���� ���� : ���� ���α׷� ���� -> Ŭ���̾�Ʈ ���α׷� ����
package ex20_4.server;


import java.net.ServerSocket;
import java.net
.Socket;

public class ServerExample {
	public static void main(String[] args) {
		System.out.println("����� ���� �Դϴ�.");
		ServerSocket serverSocket = null;
		try {
			
			//�� ������ while���� ���� �ȵ��� ������ �ּ���. ���� ������ �Ѱ� ���� ����մϴ�.
			serverSocket = new ServerSocket(9002);
			while (true) {
				//���� ��û�� ���� ������ �����մϴ�.
				//accept �޼��� : ���� �������� ���� ��û�� ������ ������ �ΰ�
				//Ŭ���̾�Ʈ ��Ĺ�� �����ؼ� �����ϴ� �޼ҵ�
				Socket socket = serverSocket.accept();
				
				//��û�� �� ������ ������ ����
				Thread thread = new PerClientThread(socket);
				thread.start();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		
		}
	}
}
