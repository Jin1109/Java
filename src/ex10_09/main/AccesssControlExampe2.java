package ex10_09.main;

import ex10_09.geometry.shape.Square;

public class AccesssControlExampe2  {
	public static void main(String[] args) {
		Square obj = new Square(100, 200, 15);
		
	
//		System.out.println("X[0]=" + obj.getX(0) + ",Y[0]=" + obj.getY(0));
//		System.out.println("X[1]=" + obj.getX(1) + ",Y[1]=" + obj.getY(1));
//		System.out.println("X[2]=" + obj.getX(2) + ",Y[2]=" + obj.getY(2));
//		System.out.println("X[3]=" + obj.getX(3) + ",Y[3]=" + obj.getY(3));
//		
//		System.out.println("(" + obj.getX(0) + ", " + obj.getY(0) + ")");
//		System.out.println("(" + obj.getX(1) + ", " + obj.getY(1) + ")");
//		System.out.println("(" + obj.getX(2) + ", " + obj.getY(2) + ")");
//		System.out.println("(" + obj.getX(3) + ", " + obj.getY(3) + ")");

		for(int i = 0; i <= 3; i ++) {
			System.out.println("X[" + i +"] = " + obj.getX(i) + ",Y[" + i + "]" + "=" + obj.getY(i));
	      }
		
		for(int i = 0; i <= 3; i ++) {
			System.out.println("(" + obj.getX(i) + ", " + obj.getY(i) + ")");
	      }
	      
	}
}
