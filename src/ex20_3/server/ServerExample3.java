//���� Ǫ�α׷�
//���� ���� : ���� ���α׷� ���� -> Ŭ���̾�Ʈ ���α׷� ����
package ex20_3.server;


import java.net.ServerSocket;
import java.net
.Socket;

public class ServerExample3 {
	public static void main(String[] args) {
		System.out.println("����� ���� �Դϴ�.");
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(9001);
			socket = serverSocket.accept();
			System.out.println("============== ���� ���� ==============");
			System.out.println(socket.getInetAddress().getHostAddress()
								+ "���� �����Ͽ����ϴ�.");
			System.out.println("=====================================");
			//�� �����η� �����鳪��.
			Thread thread1 = new SenderThread(socket);
			Thread thread2 = new ReceiverThread(socket);
			
			//�� �����带 �����մϴ�.
			thread1.start();
			thread2.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			/*
			 SebderThread,ReciverThread���� ����ϴ� socket�� �ݾ��ָ� �ȵ˴ϴ�.
			 try { 
			 	  socket.close(); // ������ �ݽ��ϴ�. 
			 } catch (Exception ignored) {
			 	  System.out.println("���� ���� �ݴ� �� ����"); }
			 */
			try {
				serverSocket.close();
			}
			catch (Exception ignored) {
				System.out.println("���� ���� �ݴ� �� ������ �߻��߽��ϴ�.");
			}
		}
	}
}
