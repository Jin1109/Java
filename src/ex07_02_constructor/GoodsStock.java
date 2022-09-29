//상품 재고 클래스
package ex07_02_constructor;
public class GoodsStock {	// 클래스의 선언을 시작하느 키워드 : class
	String goodsCode;		// 상품 코드
	int stockNum;			// 재고 수량
	
	GoodsStock (String goodsCode, int stockNum) {
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
		
	void addStock(int amount)	{		
		stockNum += amount;
	}
	
	int subtractStock(int amount)	{ 
		if (stockNum < amount)
			return 0;
		stockNum -= amount;
		return amount;
	}
}
