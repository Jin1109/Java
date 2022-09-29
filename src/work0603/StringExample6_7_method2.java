/*
1. check_length �޼���
  (1) �Ű����� : �ֹι�ȣ(String)
  (2) �Ű������� ���̰� 14���̸� true,  �ƴϸ� false ����
  
2. pandan_gender �޼���
  (1) �Ű����� : �ֹι�ȣ(String)
  (2) �ֹι�ȣ ���ڸ� ó�����ڸ� üũ�ؼ� �ش� ���ڿ��� �����մϴ�.
      1,3-����
      2,4-����
      �׿� - �ܱ��� 
             
3. check_hyphen �޼���
   (1) �Ű����� : �ֹι�ȣ(String)
   (2) �ֹι�ȣ ���ڸ� �� 7��° ���ڿ��� "-"���� �Ǵ��մϴ�.
       "-"�̸� true,  �ƴϸ� false ����

4. isNumber �޼���
   (1) �Ű����� : �ֹι�ȣ(String)
   (2) �ֹι�ȣ�� ���ʴ�� ���ؼ� ���ڰ� �ƴ� ��� �ش� �ε����� �����մϴ�.
              ��, -�� �������� ������ �ʽ��ϴ�.
              ���� ���ڸ��� ���ڸ��� �����̸� -1�� �����մϴ�.

5. main()
   (1) check_length(zumin)�� ���� ��� check_hyphen(zumin) ȣ��
   (2) check_length(zumin)�� ������ ���     "�ֹε�Ϲ�ȣ�� 14�ڸ� �Դϴ�. " ���
   (3) check_hyphen(zumin)�� ���� ��� isNumber(zumin) ȣ��
       check_hyphen(zumin)�� �����̸� "-�� �־��ּ���" ���
   (4) isNumber(zumin)�� ���� 0~5�����̸�    "�ֹι�ȣ ���ڸ��� ���ڷ� �Է��ϼ���" ���
   (5) isNumber(zumin)�� ���� 7~13�����̸�    "�ֹι�ȣ ���ڸ��� ���ڷ� �Է��ϼ���" ���      
   (6) check_length(zumin)�� true,check_hyphen(zumin) true, isNumber(zumin)�� -1 �� ���
              ���� �Ǵ� ���� �Ǵ� �ܱ��� ���
 */
package work0603;

import java.util.Scanner;

public class StringExample6_7_method2 {
	static boolean check_length(String zumin) {
  	  return zumin.length() !=14  ? false: true;
    }
   
    static String pandan_gender(String zumin) {
  	  String gender = zumin.substring(7, 8);
  	  String result = "�ܱ���";
  	  switch (gender){
		  case "1":
		  case "3":	 
			  result = "����";
			  break;
			
		  case "2":
		  case "4":	 
			  result = "����"; 
  	  }
  	  return result;
    } 
    
    static boolean check_hyphen(String zumin) {
    	 char hyphen = zumin.charAt(6); 
    	return hyphen != '-' ? false : true;   
    }
    
    static int isNumber(String zumin) {
    	String number = zumin.replace("-","0");
    	int index = 0;
    	for(int i = 0; i<number.length(); i++){
			char check = number.charAt(i);
			if (check >= 48 && check <= 57) {
				index = -1;
			}else {
				index = i;
				break;
			}
    	}
    	return index;
    }
			
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("�ֹι�ȣ�� �Է��ϼ���:");
    	System.out.print("����)123456-1234567");
    	String zumin = sc.nextLine(); 
		
		if(check_length(zumin)) {
			if(check_hyphen(zumin)) {
				if(isNumber(zumin) <= 5 && 0 <=isNumber(zumin)){
					System.out.println("�ֹι�ȣ ���ڸ��� ���ڷ� �Է��ϼ���");}
				else if(isNumber(zumin) <= 13 && 7 <=isNumber(zumin)){
					System.out.println("�ֹι�ȣ ���ڸ��� ���ڷ� �Է��ϼ���");}
				else if(isNumber(zumin) == -1){
					System.out.println(pandan_gender(zumin));}
			}else {System.out.println("-�� �־��ּ���");}
		}else {System.out.println("�ֹε�Ϲ�ȣ�� 14�ڸ� �Դϴ�.");}
    	
//    	if(check_length(zumin)); 
//    	else {System.out.println("�ֹε�Ϲ�ȣ�� 14�ڸ� �Դϴ�.");}
//    	
//    	if(check_hyphen(zumin));
//		else {System.out.println("-�� �־��ּ���");}
//
//		if(isNumber(zumin) <=5 && 0<=isNumber(zumin)){
//		System.out.println("�ֹι�ȣ ���ڸ��� ���ڷ� �Է��ϼ���");
//		}
//		else if(isNumber(zumin)>=7 && 13>=isNumber(zumin)){
//		System.out.println("�ֹι�ȣ ���ڸ��� ���ڷ� �Է��ϼ���");
//		}
//		else if(isNumber(zumin) ==-1){
//		System.out.println(pandan_gender(zumin));	
//		}
   							
		sc.close();
	}//main end
}
