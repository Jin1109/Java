//�� ���� �����ڸ� ���� Ŭ������ ��ü�� �����ϴ� ���α׷�
package work0512;
public class Work0512 {
	public static void main(String[] args) {
		   System.out.println();
		   for(int i = 0; i < 10; i++)
			   System.out.print("=");
			
		   System.out.print(" �л���	 / 	���� �������ϱ� ");
		   for(int i =0; i < 10; i++)
			   System.out.print("=");
		   	
		
		Student obj1 = new Student("��ȣ��", 85, 60, 70);
		print(obj1);

		
		
		Student obj2 = new Student("�̽±�", 90, 95, 80);
		print(obj2);


		Student obj3 = new Student("���缮", 75, 80, 100);
		print(obj3);
		
		
		Student obj4 = new Student("����", 80, 70, 95);
		print(obj4);
		
		
		Student obj5 = new Student("�̱���", 100, 65, 80);
		print(obj5);
		
		   System.out.println();
		   for (int i = 0; i < 45; i++)
			   System.out.print("=");
		   
		   System.out.println();
		   System.out.print("����\t���");
		   
		   
		   System.out.print("\t" + (obj1.kor + obj2.kor + obj3.kor + obj4.kor + obj5.kor));  
		   System.out.print("\t" + (obj1.eng + obj2.eng + obj3.eng + obj4.eng + obj5.eng));  
		   System.out.print("\t" + (obj1.math + obj2.math + obj3.math + obj4.math + obj5.math));  
	}
	
	public static void print(Student obj) {
		System.out.println();
		System.out.print("\t" + obj.name);
		System.out.print("\t" + obj.kor);
		System.out.print("\t" + obj.eng);
		System.out.print("\t" + obj.math);
		System.out.print("\t" + obj.getTotal());
		System.out.printf("\t%.1f" , obj.getAverage());
		
	}
	

		

		
			

	

}
