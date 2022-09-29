//GoodsStock 클래스의 객체를 생성해서 사용하는 프로그램
package ex07_02_constructor;
public class ClassExample1 {
	public static void main(String[] args) {
		GoodsStock obj;				//변수 선언
		obj = new GoodsStock("52135", 200);		//선언된 생성자를 이용해서 객체를 생성
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
