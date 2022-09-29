//상속 받은 wihdraw 메서드가 final 메소드라 오버라이딩 불가
package ex08_07_final_method;
public class CreditLineAccount extends Account {
   int creditLine;      //마이너스 한도 필드
   CreditLineAccount(String accountNo, String ownerName, 
		   			int balance, int creditLine){
      super(accountNo, ownerName, balance);
      this.creditLine = creditLine;
   }
      int withdraw(int amount) throws Exception {   //인출한다.
         if(balance + creditLine < amount)
            throw new Exception("잔액이 부족합니다.");
         balance -= amount;
         return amount;
   }
}