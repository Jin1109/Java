package ex11_1_String;
class StringExample1 {
	public static void main(String[] args) {
		String str = "오늘도 화이팅 입니다.";
		int len = str.length();	// length 메서드 호출
		
		for (int cnt = 0; cnt < len; cnt++) {
			char ch = str.charAt(cnt);		// charAt 메서드 호출
			System.out.println("index = " + cnt + "문자 = " + ch);
		}
	}
}
