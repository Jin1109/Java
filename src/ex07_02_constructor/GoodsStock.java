//��ǰ ��� Ŭ����
package ex07_02_constructor;
public class GoodsStock {	// Ŭ������ ������ �����ϴ� Ű���� : class
	String goodsCode;		// ��ǰ �ڵ�
	int stockNum;			// ��� ����
	
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
