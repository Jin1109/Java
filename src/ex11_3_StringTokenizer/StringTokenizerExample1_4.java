//StringTokenizer�� �̿��ؼ� ���ڿ��κ��� ��ū�� ���ϴ� ���α׷�
//���� ���ڸ� �������� ��ū�� �����մϴ�.
package ex11_3_StringTokenizer;
import java.util.StringTokenizer;
public class StringTokenizerExample1_4 {
	public static void main(String[] args) {
		StringTokenizer stok
			= new StringTokenizer("��� �� ������");
		
		while(stok.hasMoreTokens()) {//��ū�� �ִ� ���ȹݺ��ϴ� �޼���
			System.out.println(stok.nextToken());
		}
	}
}