//GoodsStock 클래스의 객체를 생성해서 사용하는 프로그램
package ex07_01_object;
public class ClassExample1 {
	public static void main(String[] args) {
		GoodsStock obj;				//변수 선언
		obj = new GoodsStock();		//객체 생성
		//GoodsStock obj = new GoodsStock ();
		
		obj.goodsCode = "52135";	//필드에 값을 대입
		obj.stockNum = 200;			//필드에 값을 대입
		System.out.println("상품코드:" + obj.goodsCode);// 필드 값 사용
		System.out.println("재고상품:" + obj.stockNum);
		
		obj.addStock(1000); 		//메소드 호출
		System.out.println("=====obj.addStock(1000) 후====");
		System.out.println("상품코드:" + obj.goodsCode);
		System.out.println("재고상품:" + obj.stockNum);
		
		obj.addStock(500); 		
		System.out.println("=====obj.addStock(500) 후====");
		System.out.println("상품코드:" + obj.goodsCode);
		System.out.println("재고상품:" + obj.stockNum);
		
	}

}
