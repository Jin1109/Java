//toString �޼ҵ� �������̵�
package ex13_4;
class GoodsStock {
	String goodsCode;		// ��ǰ�ڵ�
	int stockNum;			// ������
	
	GoodsStock(String goodsCode, int stockNum){
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	public String toString() {
		return "��ǰ�ڵ�:" + goodsCode + "������:" + stockNum;
	}
}
