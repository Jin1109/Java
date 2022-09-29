package ex05_3_while;

public class WhileExample1 {
	public static void main(String[] args) {
		int cnt=0;//초기값
		while(cnt < 10) {//최종값	  
			cnt++;	//증가값
			//cnt = cnt +1
		}
		System.out.println("==== 1 ====");
		
		//	cnt++; 를 없애봅시다
		cnt = 0;
		while (cnt < 10) {
		System.out.println(cnt++);
		}
		System.out.println("==== 2 ====");
		
		cnt = -1;
		while (++cnt < 10) { // 더하기, cnt<10 더하기가 앞에 있기 때문에 먼저 실행된다
		System.out.println(cnt); //0
		}
		System.out.println("==== 3-1 ====");
		
		
	}

}
