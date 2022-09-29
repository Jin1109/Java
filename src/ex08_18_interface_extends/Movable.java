//위치 이동 인터페이스 선언
package ex08_18_interface_extends;

public  interface Movable {
	 // 절대 위치로 이동한다 
		void moveTo(int x, int y);  
	    
	 // 상대 위치만큼 이동한다.
		void moveBy(int xOffset, int yOffset); 
}
