package ex20_3.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SenderThread extends Thread {
   private Socket socket;
   
   SenderThread(Socket socekt){
      this.socket = socekt;
   }
   
   public void run() {
       PrintWriter writer=null;
       BufferedReader reader=null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            
            writer = new PrintWriter(socket.getOutputStream());
            
            while (!socket.isClosed()) {
               //Ű����κ��� ���ڿ��� �Է¹޽��ϴ�.
                String str = reader.readLine();
                
                //����ڰ� "bye"��� �Է��ϸ� �ݺ����� ���������ϴ�.
                if (str.equals("bye"))
                   break;
                
                //�Էµ� ���ڿ��� �۽��մϴ�.
               writer.println(str);
               writer.flush();
            }
        } catch (Exception e) {           
            System.out.println(e.getMessage());
        } finally {
            try {
                writer.close();
            }
            catch (Exception e) {
               e.printStackTrace();
            }
            try {
                reader.close();
            }
            catch (Exception e) {
               e.printStackTrace();
            }
            
          
        }
    }

}