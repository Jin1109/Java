package ex07_15_static_method;

public class StaticMethodExample2 {
	public static void main(String[] args) {
		// 정적 메서드 호출문
		int grandTotal = Accumulator.getGrandTotal();
		System.out.println("총계 = " + grandTotal);
		Accumulator obj1 = new Accumulator();
		Accumulator obj2 = new Accumulator();
		obj1.accumulate(10);
		obj2.accumulate(20);
		
		// 정적 메서드 호출문
		grandTotal = Accumulator.getGrandTotal();
		
		//인스턴스 메서드 print ()를 정적 메서드인 main()에서 호출할 수 없습니다.
		StaticMethodExample2 s = new StaticMethodExample2();
		s.print(obj1);
		s.print(obj2); //이 메서드를 사용하기 위해서는	?
		System.out.println("총계 = " + grandTotal);
	}//main() end
	
	void print(Accumulator a) {
		System.out.println("total = " + a.total);
	}//print end
	
}
