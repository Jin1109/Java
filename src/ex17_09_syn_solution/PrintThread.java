//계좌 잔엑 합계를 출력하는 스레드 클래스
package ex17_09_syn_solution;

public class PrintThread extends Thread{
   
   private SharedArea sharedArea;
   
   PrintThread(SharedArea area){
      sharedArea = area;
   }//생성자 end

   public void run() {
      for(int cnt = 0; cnt < 3; cnt++) {
    	  /*
    	   	synchronized 키워드를 사용해서 블록으로 묶은 블록으로 부분을 동기화 블럭이라고 합니다.
    	   */
    	  //동기화 시작
    	  synchronized (sharedArea) {
    		  int sum = sharedArea.getAccount1().getBalance() + sharedArea.getAccount2().getBalance();
   	         System.out.println("계좌 잔액 합계 : " + sum);
		}
    	//동기화 끝
    	  
		     try {
		         Thread.sleep(1);
		      } catch(InterruptedException e) {
		         System.out.println(e.getMessage());
	      }//catch end
	   }// for end
	}//run end
}//class end   