/*
1. check_length 메서드
  (1) 매개변수 : 주민번호(String)
  (2) 매개변수의 길이가 14개이면 true,  아니면 false 리턴
  
2. pandan_gender 메서드
  (1) 매개변수 : 주민번호(String)
  (2) 주민번호 뒷자리 처음문자를 체크해서 해당 문자열을 리턴합니다.
      1,3-남자
      2,4-여자
      그외 - 외국인 
             
3. check_hyphen 메서드
   (1) 매개변수 : 주민번호(String)
   (2) 주민번호 앞자리 후 7번째 문자열이 "-"인지 판단합니다.
       "-"이면 true,  아니면 false 리턴

4. isNumber 메서드
   (1) 매개변수 : 주민번호(String)
   (2) 주민번호를 차례대로 비교해서 숫자가 아닌 경우 해당 인덱스를 리턴합니다.
              단, -은 숫자인지 비교하지 않습니다.
              만약 앞자리와 뒷자리가 숫자이면 -1을 리턴합니다.

5. main()
   (1) check_length(zumin)이 참인 경우 check_hyphen(zumin) 호출
   (2) check_length(zumin)이 거짓인 경우     "주민등록번호는 14자리 입니다. " 출력
   (3) check_hyphen(zumin)이 참인 경우 isNumber(zumin) 호출
       check_hyphen(zumin)이 거짓이면 "-을 넣어주세요" 출력
   (4) isNumber(zumin)의 값이 0~5사이이면    "주민번호 앞자리를 숫자로 입력하세요" 출력
   (5) isNumber(zumin)의 값이 7~13사이이면    "주민번호 뒷자리를 숫자로 입력하세요" 출력      
   (6) check_length(zumin)는 true,check_hyphen(zumin) true, isNumber(zumin)이 -1 인 경우
              남자 또는 여자 또는 외국인 출력
 */
package ex11_1_String;

public class StringExample6_7_method2 {
	public static void main(String[] args) {
		String zumin = "123456-1234569";
		
		if (check_length(zumin)) {
		//if (check_length(zumin) == 14) {
			if (check_hyphen(zumin)) {
				int isNumber = isNumber(zumin);
				if(isNumber >= 0 && isNumber <= 5){
					System.out.println("주민번호 앞자리를 숫자로 입력하세요");
				}else if(isNumber >= 7 && isNumber <= 13){
					System.out.println("주민번호 뒷자리를 숫자로 입력하세요");
				}else if(isNumber == -1){
					System.out.println(pandan_gender(zumin) + "입니다");
				}
			} else {
				System.out.println("-을 넣어주세요");
			}
			
		} else {
			System.out.println("주민등록번호는 14자리 입니다.");
		}
	}//main end
	
	static boolean check_length(String zumin) {
		return zumin.length() == 14;
	}
	
	static boolean check_hyphen(String zumin) {
		return zumin.substring(6,7).equals("-");
	}
	
	static int isNumber(String zumin) {
		int index = -1;
		int len = zumin.length();
		
		for (int i =0; i < len; i++) {
			
			if (i==6)
				continue;
			
			char test = zumin.charAt(i);
			//if (!(zumin.charAt(i) >= '0' && zumin.charAt(i) <= '9')) {
			if(test < '0' || test > '9') {
				index = i;
				break;
			}
		}
		return index;
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
	
	
	
	
}
