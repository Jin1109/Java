//���� �ܿ� �հ踦 ����ϴ� ������ Ŭ����
package ex17_09_syn_solution;

public class PrintThread extends Thread{
   
   private SharedArea sharedArea;
   
   PrintThread(SharedArea area){
      sharedArea = area;
   }//������ end

   public void run() {
      for(int cnt = 0; cnt < 3; cnt++) {
    	  /*
    	   	synchronized Ű���带 ����ؼ� ������� ���� ������� �κ��� ����ȭ ���̶�� �մϴ�.
    	   */
    	  //����ȭ ����
    	  synchronized (sharedArea) {
    		  int sum = sharedArea.getAccount1().getBalance() + sharedArea.getAccount2().getBalance();
   	         System.out.println("���� �ܾ� �հ� : " + sum);
		}
    	//����ȭ ��
    	  
		     try {
		         Thread.sleep(1);
		      } catch(InterruptedException e) {
		         System.out.println(e.getMessage());
	      }//catch end
	   }// for end
	}//run end
}//class end   