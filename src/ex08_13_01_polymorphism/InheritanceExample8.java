package ex08_13_01_polymorphism;

public class InheritanceExample8 {

   public static void main(String[] args) {
      EMailSender obj1 =
            new EMailSender("생일을 축하합니다", "고객센터", 
                  "admin@dukeeshop.co.kr", "10% 할인쿠폰이 발행되었습니다.");
      
      SMSSender obj2 = new SMSSender("생일을 축하합니다", "고객센터", 
            "02-000-0000", "10% 할인쿠폰이 발행되었습니다.");
      
      // 서브 클래스 객체 obj1, obj2를 가지고 메소드를 호출
      send(obj1, "hatman@yeyeye.com");
      send(obj1, "stickman@hahaha.com");
      send(obj2, "010-000-0000");
   }

   static void send(MessageSender obj, String recipient) {
      //어느 클래스의 sendMessage메소드가 호출될까요?
      //EMailSender 또는 SMSSender
      obj.sendMessage(recipient);
      
   }

}