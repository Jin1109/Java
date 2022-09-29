//단행본 클래스와 부록 CD 클래스를 사용하는 프로그램
package ex08_14_02_interface;
class InterfaceExample2 {
	public static void main(String arg[]) {
		SeparateVolume obj1
				= new SeparateVolume("8631774개", "개미", "베르베르");
		obj1.checkOut("홍길동", "2021-10-25");
		obj1.checkIn();
		
		AppCDInfo obj2
		= new AppCDInfo("2005-7001", "Redhat Fedora");
		obj2.checkOut("홍길동", "2021-10-25");
		obj2.checkIn();
	}

}
