//checked exception�� ������ �޼ҵ�
//������ ���� �߻�
//throws Exception�� ���� �޼ҵ� ȣ�� �� try~catch������ ó��
package ex07_2_Exception;

public class ExceptionExample3_1 {

   public static void main(String[] args) {
      int result = add(1, -2);
      System.out.println(result);

   }
   //throws Exception : throw�� ���� �߻��� ������ ȣ���� �޼���� �ѱ�ϴ�.
   static int add(int a, int b) {
      int result = a + b;
      if (result < 0)
         throw new Exception("0���� �۾� ���� �߻��մϴ�.");
      return result;
   }

}