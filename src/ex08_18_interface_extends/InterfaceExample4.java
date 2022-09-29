package ex08_18_interface_extends;

public class InterfaceExample4 {
	public static void main(String args[]) {
        Rectangle obj = new Rectangle(100, 200, 10, 10); 
        printRectangle(obj);//사각형: 위치(100, 200) 크기( 10 x  10) 
        
        obj.moveTo(25, 35);	//사각형: 위치( 25,  35) 크기( 10 x  10)             
        printRectangle(obj);
        
        obj.moveBy(-5, -5);	//사각형: 위치( 20,  30) 크기( 10 x  10) 
        printRectangle(obj);
        
        obj.resize(30, 30); //사각형: 위치( 20,  30) 크기( 30 x  30)
        printRectangle(obj);
    }

	private static void printRectangle(Rectangle obj) {
		// TODO Auto-generated method stub
		System.out.printf("사각형 : 위치(%3d,%3d) 크기(%3d x %3d) %n",
						obj.x,obj.y,obj.width,obj.height);

		
	}
}
