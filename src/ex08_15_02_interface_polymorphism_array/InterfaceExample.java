//저자 출력해 보세요
package ex08_15_02_interface_polymorphism_array;

class InterfaceExample {
	public static void main(String arg[]) {
		//int[] a = new int[3];
		//String[] a = new String[3];
		Lendable arr[] = new Lendable [3];//인터페이스 타입의 배열
		
		
		//배열애 여러 타이븨 객체 주소 저장
		arr[0] = new SeparateVolume("8839", "푸코의 진자", "에코");
		arr[1] = new SeparateVolume("609.2", "서양미술사", "곰브리치");
		arr[2] = new AppCDInfo("02-17", "XML을 위한 자바 프로그래밍", "유시진");
		
		
		checkOutAll(arr, "수지", "2022-06-02");
	}
	
	//자바 컴파일러는 컴파일 할 떄 변수의 타입만 보고 메소드나
	//필드의 존재 여부를 체크하기 때문에
	//Lendable 인터페이스에 checkOut메소드가 있어야 컴파일 에러가 없습니다.
	 static void checkOutAll(Lendable[] arr, String borrower, String date) {
//	      for(int i = 0; i < arr.length; i++)
//	         arr[i].checkOut(borrower, date); 
		 for(Lendable a : arr) {
			 a.checkOut(borrower, date);
		 }
		 
	}
}
