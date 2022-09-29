//���� �ܿ� �հ踦 ����ϴ� ������ Ŭ����
package ex17_08_syn_problem;

public class PrintThread extends Thread{
   
   private SharedArea sharedArea;
   
   PrintThread(SharedArea area){
      sharedArea = area;
   }//������ end

   public void run() {
      for(int cnt = 0; cnt < 3; cnt++) {
         int sum = sharedArea.getAccount1().getBalance() + 
        		   sharedArea.getAccount2().getBalance();
	         System.out.println("���� �ܾ� �հ� : " + sum);
		     try {
		         Thread.sleep(1);
		      } catch(InterruptedException e) {
		         System.out.println(e.getMessage());
	      }//catch end
	   }// for end
	}//run end
}//class end   