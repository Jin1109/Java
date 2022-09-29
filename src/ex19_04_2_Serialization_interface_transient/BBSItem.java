//������, �޼���, ���� �ʵ�� ����ȭ ����� �ƴմϴ�.
//�ν��Ͻ� �ʵ�� ����ȭ ����Դϴ�.
//transient Ű���� : ����ȭ���� ���� ��ų �ʵ带 ǥ���ϴ� Ű����
//���� ���� : ObjectOutputExample3.java -> ObjectInputExample3
package ex19_04_2_Serialization_interface_transient;
public class BBSItem implements java.io.Serializable {//�Խù� Ŭ����
	static private int itemNum = 0; // �Խù��� ��-���� �ʵ�� ����ȭ ����� ���� �ʽ��ϴ�.
	private String writer; 			// �۾��� - �ν��Ͻ� �ʵ�� ����ȭ ����� �˴ϴ�.
	private transient String passwd;// �н����� - �ν��Ͻ� �ʵ�� ����ȭ ����� �˴ϴ�.
									// ����ȭ ����� ���� �ʽ��ϴ�.
	private String title;			// ���� - �ν��Ͻ� �ʵ�� ����ȭ ����� �˴ϴ�.
	private String content;			// ���� - �ν��Ͻ� �ʵ�� ����ȭ ����� �˴ϴ�.
	
	//�����ڴ� ����ȭ ����� ���� �ʽ��ϴ�.
	BBSItem(String writer, String passwd, String title, String content) {
		this.writer=writer;
		this.passwd=passwd;
		this.title=title;
		this.content=content;
		itemNum ++;
	};
	
	//�޼ҵ�� ����ȭ ����� ���� �ʽ��ϴ�.
	 void modifyContent(String Content,String password) {
		 if(!password.equals(this.passwd)) 
			return;
		  this.content = content; 	
	}
	 
	 //�޼ҵ�� ����ȭ ����� ���� �ʽ��ϴ�.
	 public String toString() {
		 return "��ü�Խù��� ��:" + itemNum +
				 "\n�۾���: " + writer +
				 "\n�н�����: " + passwd +
				 "\n����: " + title +
				 "\n����: " + content;
	 }
}
