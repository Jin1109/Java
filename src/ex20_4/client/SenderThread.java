package ex20_4.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SenderThread extends Thread {
   private Socket socket;
   private String name;//�߰�
   
   SenderThread(Socket socekt, String name){ //����
      this.socket = socekt;
      this.name = name; //�߰�
   }
   
   public void run() {
       PrintWriter writer=null;
       BufferedReader reader=null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            writer = new PrintWriter(socket.getOutputStream());
            
            //�߰�
            //���� ���� ������ ��ȭ���� �۽��մϴ�.
            writer.println(name);
            writer.flush();
            
            //Ű����κ��� ���ڿ��� �Է¹޽��ϴ�.
            while (!socket.isClosed()) {
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