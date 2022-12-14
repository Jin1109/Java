package ex20_2.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample2 {
	public static void main(String[] args) {
		System.out.println("여기는 서버 입니다.");
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(9001);
			socket = serverSocket.accept();
			/*
			 InputStreamReader클래스:
				 바이트 스트림을 문자 스트림으로 바꾸어주는 클래스
				 이 클래스의 생성자에 소켓으로부터 얻은 InputStream 객체를 넘겨 주면
				 네트워크로 수신된 데이터를 문자 스트림 형대로 읽을 수 있는
			 InputStreamReader객체가 생성됩니다.
			 */
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(socket.getInputStream()));
			/*
			 PrintWriter 클랴스를 이용하여 문자 스트림을 바이트 스트림으로 바꾸어서
			 		출력하기 위해서는 이 클래스의 생성자에 OutputStream 타입의 개게를 파라미터로
			 		넘겨주어야 합니다.
			 */
					PrintWriter writer =
							new PrintWriter(socket.getOutputStream());
					
					//데이터를 수신합니다.
					String str = reader.readLine();
					
					//데이터를 화면에 출력합니다.
					System.out.println(str);
					
					//데이터를 송신합니다.
					writer.println("Hello, Client2");
					
			 /*
			  PrintWrtier 클래스의 Println()매소드로 문자열을 출력하면 그 문자열이
			  메소드 호출 즉시 네트워크로 송신되는 것이 아니라 버퍼가 다 잘 떄까지 모아졌다기
			  한꺼번에 송신됩니다.
			  그래서 println() 매소드를 호출한 다음에 바로 문자열이 송신되도록 하려면	
			  */
					writer.flush();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close(); // 소켓을 닫습니다.
			} catch (Exception ignored) {
				System.out.println("서버 소켓 닫는 중 오류");
			}
		}
	}
}
