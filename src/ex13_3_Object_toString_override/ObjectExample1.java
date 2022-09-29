//Object의 toString 메소드 오버라이딩 예
package ex13_3_Object_toString_override;
class ObjectExample1 {
	public static void main(String[] args) {
		GoodsStock obj = new GoodsStock("73527", 200);
		String str = obj.toString();
		System.out.println(str);
	}
}
