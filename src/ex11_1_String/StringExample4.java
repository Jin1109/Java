//똑같은 문자열 리터럴이 하나의 String 객체로 만들어져 공유됩니다.
//참조값이 갑습니다.
package ex11_1_String;
class StringExample4 {
	public static void main(String[] args) {
		String str1 = "자바";
		String str2 = "자바";
		
		if (str1.equals(str2))
			System.out.println("str1.equals(str2) 같음");
		else
			System.out.println("str1.equals(str2) 다름");
	}
	
}
