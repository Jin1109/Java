package ex20_2.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample2 {
	public static void main(String[] args) {
		System.out.println("����� ���� �Դϴ�.");
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(9001);
			socket = serverSocket.accept();
			/*
			 InputStreamReaderŬ����:
				 ����Ʈ ��Ʈ���� ���� ��Ʈ������ �ٲپ��ִ� Ŭ����
				 �� Ŭ������ �����ڿ� �������κ��� ���� InputStream ��ü�� �Ѱ� �ָ�
				 ��Ʈ��ũ�� ���ŵ� �����͸� ���� ��Ʈ�� ����� ���� �� �ִ�
			 InputStreamReader��ü�� �����˴ϴ�.
			 */
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(socket.getInputStream()));
			/*
			 PrintWriter Ŭ������ �̿��Ͽ� ���� ��Ʈ���� ����Ʈ ��Ʈ������ �ٲپ
			 		����ϱ� ���ؼ��� �� Ŭ������ �����ڿ� OutputStream Ÿ���� ���Ը� �Ķ���ͷ�
			 		�Ѱ��־�� �մϴ�.
			 */
					PrintWriter writer =
							new PrintWriter(socket.getOutputStream());
					
					//�����͸� �����մϴ�.
					String str = reader.readLine();
					
					//�����͸� ȭ�鿡 ����մϴ�.
					System.out.println(str);
					
					//�����͸� �۽��մϴ�.
					writer.println("Hello, Client2");
					
			 /*
			  PrintWrtier Ŭ������ Println()�żҵ�� ���ڿ��� ����ϸ� �� ���ڿ���
			  �޼ҵ� ȣ�� ��� ��Ʈ��ũ�� �۽ŵǴ� ���� �ƴ϶� ���۰� �� �� ������ ������ٱ�
			  �Ѳ����� �۽ŵ˴ϴ�.
			  �׷��� println() �żҵ带 ȣ���� ������ �ٷ� ���ڿ��� �۽ŵǵ��� �Ϸ���	
			  */
					writer.flush();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close(); // ������ �ݽ��ϴ�.
			} catch (Exception ignored) {
				System.out.println("���� ���� �ݴ� �� ����");
			}
		}
	}
}
