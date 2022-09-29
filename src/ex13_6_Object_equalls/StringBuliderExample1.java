package ex13_6_Object_equalls;
class StringBuliderExample1 {
	public static void main(String[] args) {
		StringBuffer sb =  new StringBuffer("동해물과 백두산이 마르고  ");
		StringBuffer sb2 = new StringBuffer("동해물과 백두산이 마르고  ");
		
		if(sb==sb2)
			System.out.println("sb==sb2 같음");
		else
			System.out.println("sb==sb2 다름");
		
		//StringBuffer클래스는 equals()메서드를 오버라이딩하지 않았습니다.
		if(sb.equals(sb2))
			System.out.println("sb.equals(sb2) 같음");
		else
			System.out.println("sb.equals(sb2) 다름");
		
		if(sb.toString().equals(sb.toString()))
			System.out.println("sb.toString().equals(sb2.toString()) 같음");
		else
			System.out.println("sb.toString().equals(sb2.toString()) 다름");
		
	}
}
