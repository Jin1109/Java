//서버 푸로그램
//실행 순서 : 서버 프로그램 실행 -> 클라이언트 프로그램 실행
package ex20_3.server;


import java.net.ServerSocket;
import java.net
.Socket;

public class ServerExample3 {
	public static void main(String[] args) {
		System.out.println("여기는 서버 입니다.");
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(9001);
			socket = serverSocket.accept();
			System.out.println("============== 접속 정보 ==============");
			System.out.println(socket.getInetAddress().getHostAddress()
								+ "에서 접속하였습니다.");
			System.out.println("=====================================");
			//두 수래두룰 샹송헙나다.
			Thread thread1 = new SenderThread(socket);
			Thread thread2 = new ReceiverThread(socket);
			
			//두 스레드를 시작합니다.
			thread1.start();
			thread2.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			/*
			 SebderThread,ReciverThread에서 사용하는 socket을 닫아주면 안됩니다.
			 try { 
			 	  socket.close(); // 소켓을 닫습니다. 
			 } catch (Exception ignored) {
			 	  System.out.println("서버 소켓 닫는 중 오류"); }
			 */
			try {
				serverSocket.close();
			}
			catch (Exception ignored) {
				System.out.println("서버 소켓 닫는 중 에러가 발생했습니다.");
			}
		}
	}
}
