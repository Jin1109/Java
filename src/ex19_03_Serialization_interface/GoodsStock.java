//����ȭ ���� Ŭ������ ����� ��
// - Implements iava.io.Serializable ���� Ŭ����-����ȭ �ȵ�
//���� ���� : ObjectOutputExample2.java -> ObjectInputExample2.java
package ex19_03_Serialization_interface;

public class GoodsStock implements java.io.Serializable {   
	
	//private static final long serialVerstionUTD = 1L;
	private static final long serialVersionUID = -6262106513615875683L;
	//private static final long serialVersionUID = 1L;
	
	
	private String code;       
	private int num;         
    GoodsStock(String code, int num) {   
        this.code = code;
        this.num = num;
    }
    void addStock(int num) {  
        this.num += num;              
    }
    int subtractStock(int num) throws Exception {  
        if (this.num < num)
            throw new Exception("��� �����մϴ�.");
        this.num -= num;            
        return num;
    }
    
    public String toString() {
    	return "��ǰ�ڵ�:" + code + "\t��ǰ����:" + num;
    }
	    

}
