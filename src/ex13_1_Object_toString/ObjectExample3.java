/*
Object클래스에 정의된 toString()은 인스턴스에 대한 정보를
문자열(String)로 제공할 목적으로 정의한 것입니다.
클래스 작성할 떄 toSring()을 오버라이딩 하지 않으면 아래와 같이
정의된 내용이 그대로 사용될 것입니다.

   public String toString(){
   return getClass().getName() + "@"
         + Integer.toHexString(hashCode());
   }
   
  - getClass() 메소드와 hashCode()메소드 역시 Object클래스의 메소드이므로
           호출할 수 있습니다.
     해시 코드는 인스턴스의 주소와 관련된 값입니다.
     
  - hashCode()메서드는 해싱(hashing) 기법에 사용되는
     해시함수(hash functuin)를 구현한 것입니다.
     해싱은 데이터 관리 기법 중의 하나로 다량의 데이터를 저자하고 검색하는데 유용합니다.
     해시함수는 찾고자하는 값을 입력하면 그 값이 저장된 위치를 알려주는 해시코드를
     반환합니다.
  
  - Circle 인스턴스 두 개를 생성한 다음 각 인스턴스에 toString()을
        호출한 결과를 출력했습니다.
     Circle 클래스에서 Object 클래스로부터 상속받은 toString()을 오버라이딩
        하지 않았기 떄문에 Circle 인스턴스에 toString()을 호출하면
     Object 클래스의 toString()이 호출됩니다.
 */
package ex13_1_Object_toString;
class ObjectExample3 {
	public static void main(String[] args) {
		Circle2 obj1 = new Circle2(5);
		Circle2 obj2 = new Circle2(15);
		
		System.out.println(obj1.toString());
		//System.out.print()나 System.out.println()메소드에
		//문자열이 아닌 객체를 넘겨주면 toString()메소드가 호출된다.
		System.out.println(obj1);
		
		System.out.println(obj2.toString());
		System.out.println(obj2);
	}

}
