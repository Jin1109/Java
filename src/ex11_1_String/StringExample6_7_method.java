//charAt () �޼ҵ带 ����Ͽ� �ֹι�ȣ ���ڸ� ���� ��
/*
 1. substring(int beginIndex) : beginIndex���� ���ڿ� ������ �κ� ���ڿ� ����
 2. substring(int beginIndex, int endIndex) :
                         beginIndex���� endIndex-1 ���� �κ� ���ڿ� ����
 */
/*
��°��)
������ ���ڴ� 4�̰� �����Դϴ�.
 */
package ex11_1_String;

public class StringExample6_7_method {
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
      
      public static void main(String[] args) {
		String zumin ="123456-1789012";
		
		if(check_length(zumin)) {
			System.out.println(pandan_gender(zumin) + "�Դϴ�.");
		}else {
			System.out.println("�ֹε�Ϲ�ȣ�� 14�ڸ� �Դϴ�.");
		}
	}//main end
}