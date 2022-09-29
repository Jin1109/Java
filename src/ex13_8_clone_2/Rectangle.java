//���� ������ Ŭ������ �����
//1�ܰ� - Cloneable �������̽� ����
//2�ܰ� - clone()�޼ҵ� �������̵� �ϱ�

package ex13_8_clone_2;

//Cloneable�������̽��� �����Ǿ� �ִٴ� ���� Ŭ���� �ۼ��ڰ� ������ ����Ѵٴ� �ǹ��Դϴ�.
public class Rectangle implements Cloneable {
   int width, height;
   
   Rectangle(int width, int heigth){
      this.width = width;
      this.height = heigth;
   }
   
   /*���� ��ȯ Ÿ��(covariant return type)-JDK1.5���� ����
    *  �������̵� �� �� ���� �޼����� ��ȯŸ���� �ڼ� Ŭ������ Ÿ������ ������ ����ϴ� ���Դϴ�.
    
    *  ��, ��ȯ���� Object���� �ڼ� Ŭ���� Ÿ������ ������ ����մϴ�.
      
     * ������ : clone()ȣ�� �� �� ��ȯ�� �ʿ� �����ϴ�.(main �޼���)
        Rectangle obj2 = (Rectangle) obj1.clone();
        ==> Rectangle obj2 = obj1.clone();
    */
   public Rectangle clone() {// ����� �� : Object�� -> Rectangle������ ����.
      try {
         //���� Ŭ������ clone�޼ҵ带 ȣ���ؼ� �� ����� ����
         return (Rectangle) super.clone(); // ����� �� : Rectangle������ ��ȯ�մϴ�.
      }
      //���� Ŭ������ clone()�޼ҵ尡 �߻��ϴ� �ͼ����� ó��
      catch(CloneNotSupportedException e) {
         return null;
      }
   }
   
   public String toString() {
      return "width " + width + ", height " + height;
   }
   public boolean equals(Object obj) {
      
      if(obj != null && obj instanceof Rectangle) {
         Rectangle r = (Rectangle)obj;
         return this.width == r.width && this.height == r.height;         
      }else {
         return false;
      }
   }
}