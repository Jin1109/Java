package ex04_07_concate_op;

public class Concate2_hap {
	public static void main(String[] args) {
		String str1 = "hap=" + 3 + 4;
		System.out.println(str1);//hap=34 -> hap이 문자열이므로 뒤에가 문자열로 변환 
		
		String str2 = 3 + 4 + "=hap";
		System.out.println(str2);//7=hap
		
		String str3 = "hap=" + (3 + 4);
		System.out.println(str3);//hap=7 -> 3 + 4가 소괄호안에 있으므로 7로 먼저 계산된다
		
		str1 = "" + 3 + 4;
		System.out.println(str1);//34 -> ""은 문자열이므로 3 4문자열로 변환
		
		str1 = 3 + 4 + "";
		System.out.println(str1);//7
		
		str1 = 3 + 4 + "" + "입니다.";//7입니다.
		System.out.println(str1);
		
		str1 = 3 + 4 + "입니다.";
		System.out.println(str1);//7입니다.
		
	}
}
