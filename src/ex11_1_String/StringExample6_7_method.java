//charAt () 메소드를 사용하여 주민번호 뒷자리 추출 예
/*
 1. substring(int beginIndex) : beginIndex부터 문자열 끝까지 부분 문자열 리턴
 2. substring(int beginIndex, int endIndex) :
                         beginIndex부터 endIndex-1 까지 부분 문자열 리턴
 */
/*
출력결과)
추출한 숫자는 4이고 여자입니다.
 */
package ex11_1_String;

public class StringExample6_7_method {
      static boolean check_length(String zumin) {
    	  return zumin.length() !=14  ? false: true;
      }
      
     
        
	
      
      static String pandan_gender(String zumin) {
    	  String gender = zumin.substring(7, 8);
    	  String result = "외국인";
    	  switch (gender){
		  case "1":
		  case "3":	 
			  result = "남자";
			  break;
			
		  case "2":
		  case "4":	 
			  result = "여자"; 
    	  }
    	  return result;
     
      } 
      
      public static void main(String[] args) {
		String zumin ="123456-1789012";
		
		if(check_length(zumin)) {
			System.out.println(pandan_gender(zumin) + "입니다.");
		}else {
			System.out.println("주민등록번호는 14자리 입니다.");
		}
	}//main end
}