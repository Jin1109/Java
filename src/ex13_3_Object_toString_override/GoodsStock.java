//toString 메소드 오버라이딩
package ex13_3_Object_toString_override;
class GoodsStock {
	String goodsCode;		// 상품코드
	int stockNum;			// 재고수량
	
	GoodsStock(String goodsCode, int stockNum){
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	public String toString() {
		return "상품코드:" + goodsCode + "재고수량:" + stockNum;
	}
}
