/*
ObjectŬ������ ���ǵ� toString()�� �ν��Ͻ��� ���� ������
���ڿ�(String)�� ������ �������� ������ ���Դϴ�.
Ŭ���� �ۼ��� �� toSring()�� �������̵� ���� ������ �Ʒ��� ����
���ǵ� ������ �״�� ���� ���Դϴ�.

   public String toString(){
   return getClass().getName() + "@"
         + Integer.toHexString(hashCode());
   }
   
  - getClass() �޼ҵ�� hashCode()�޼ҵ� ���� ObjectŬ������ �޼ҵ��̹Ƿ�
           ȣ���� �� �ֽ��ϴ�.
     �ؽ� �ڵ�� �ν��Ͻ��� �ּҿ� ���õ� ���Դϴ�.
     
  - hashCode()�޼���� �ؽ�(hashing) ����� ���Ǵ�
     �ؽ��Լ�(hash functuin)�� ������ ���Դϴ�.
     �ؽ��� ������ ���� ��� ���� �ϳ��� �ٷ��� �����͸� �����ϰ� �˻��ϴµ� �����մϴ�.
     �ؽ��Լ��� ã�����ϴ� ���� �Է��ϸ� �� ���� ����� ��ġ�� �˷��ִ� �ؽ��ڵ带
     ��ȯ�մϴ�.
  
  - Circle �ν��Ͻ� �� ���� ������ ���� �� �ν��Ͻ��� toString()��
        ȣ���� ����� ����߽��ϴ�.
     Circle Ŭ�������� Object Ŭ�����κ��� ��ӹ��� toString()�� �������̵�
        ���� �ʾұ� ������ Circle �ν��Ͻ��� toString()�� ȣ���ϸ�
     Object Ŭ������ toString()�� ȣ��˴ϴ�.
 */
package ex13_1_Object_toString;
class ObjectExample2 {
	public static void main(String[] args) {
		Circle obj1 = new Circle(5);
		Circle obj2 = new Circle(5);
		
		System.out.println(obj1.toString());
		//System.out.print()�� System.out.println()�޼ҵ忡
		//���ڿ��� �ƴ� ��ü�� �Ѱ��ָ� toString()�޼ҵ尡 ȣ��ȴ�.
		System.out.println(obj1);
		
		System.out.println(obj2.toString());
		System.out.println(obj2);
	}

}