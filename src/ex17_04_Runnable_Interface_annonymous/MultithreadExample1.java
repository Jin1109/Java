//Runnable인터페이스르 이용한 멀티스레드 프로그램
package ex17_04_Runnable_Interface_annonymous;
public class MultithreadExample1 {
	public static void main(String[] args) {
		//Runnable인터페이스를 구현하는 클래스의 객체를 생성해서
		//Thread 생성자의 파라미터로 사용합니다.
		Thread thread = new Thread(new Runnable() {
				public void run() {
					for (char ch = 'a'; ch<='z'; ch++)
						System.out.print(ch);
				}
			});//스레드 생성
		
		thread.start();
		char arr[] = { 'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ',
					   'ㅇ','ㅈ','ㅊ','ㅋ','ㄷ','ㅍ','ㅎ' };
		
		for (char ch : arr)
			System.out.print(ch);
	}

}
