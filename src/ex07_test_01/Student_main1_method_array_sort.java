package ex07_test_01;

public class Student_main1_method_array_sort {

	public static void main(String[] args) {

		Student [] students = { new Student("��ȣ��", 85, 60, 70),
								new Student("�̽±�", 90, 95, 80),
								new Student("���缮", 75, 80, 100),
								new Student("����", 80, 70, 95),
								new Student("�̱���", 100, 60, 80) };
			sort(students);
			printInfo(students);
			
		}//main
	
	
		// �л��� ������ �������� �����ϱ�
		static void sort (Student[] students) {
					Student imsi;
					for (int i= 0; i < students.length - 1; i++) {
				    	   for (int j = i + 1; j < students.length; j++) {
				    		   if (students[i].getTotal() < students[j].getTotal()) {
				    			    imsi = students[i];
				    			    students[i] = students[j];
				    			   students[j] = imsi;
				    		   }   
				    	   }	 
				       } 
				       
		}
	
	
		static void printInfo(Student[] objs) {
			int total[] = new int[3];
			
			System.out.println("==========   �л���    /   ���� �������ϱ� ==========");
			System.out.println("�̸�\t����\t����\t����\t����\t���");
			
			for (Student obj : objs) {
				System.out.print(obj.name + "\t" + obj.kor + "\t" 
							+ obj.eng + "\t" + obj.math + "\t" + obj.getTotal() + "\t" );
				System.out.printf("%.1f\n", obj.getAverage());
				
				total[0] += obj.kor; 
				total[1] += obj.eng; 
				total[2] += obj.math;

		}
				
		for (int i = 0; i < 45; i++) {
			System.out.print("=");
		}

		System.out.print("\n����\t");
		for (int i = 0; i < total.length; i++)
			System.out.print(total[i] + "\t");

	}

	

}