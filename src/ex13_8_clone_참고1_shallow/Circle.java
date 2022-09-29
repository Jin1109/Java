package ex13_8_clone_����1_shallow;
public class Circle implements Cloneable {
   Point p;
   double r;
   
   Circle(Point p, double r){
      this.p = p;
      this.r = r;
   }
   /*���� ��ȯ Ÿ��(covariant return type)-JDK1.5���� ����
    *  �������̵� �� �� ���� �޼����� ��ȯŸ���� �ڼ� Ŭ������ Ÿ������ ������ ����ϴ� ���Դϴ�.
    
    *  ��, ��ȯ���� Object���� �ڼ� Ŭ���� Ÿ������ ������ ����մϴ�.
      
     * ������ : clone()ȣ�� �� �� ��ȯ�� �ʿ� �����ϴ�.(main �޼���)
        Rectangle obj2 = (Rectangle) obj1.clone();
        ==> Rectangle obj2 = obj1.clone();
    */
   //���� ���� = ��ü�� ����� ���� �״�� ����
   //��ü�� �����ϰ� �ִ� ��ü���� ���������� �ʽ��ϴ�.
   public Circle clone() {
      try {
         return (Circle) super.clone();//������ clone()�� ȣ��
      }catch (CloneNotSupportedException e) {
         System.out.println("���� ���� �߻��߽��ϴ�.");
         return null;
      }
   }
      
   public String toString(){
	   return "[p=" + p + ", r=" + r + "]";
   }
      
}
   
