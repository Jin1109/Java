package ex06_1_array;

public class TwoArrayExample1 {
	public static void main(String[] args) {
		int table[][] = new int[3][4];//3행 4월의 크기로 생성
		
		table[0][0] = 10;
		table[1][1] = 20;
		table[2][3] = table[0][0] + table[1][1];
		//설정해주지 않은 값은 0을 초기값으로 가진다.
		
		System.out.println(table[0][0]);
		System.out.println(table[1][1]);
		System.out.println(table[2][3]);
//		System.out.println("table[3][4] = " + table[3][4]);
		
		System.out.println("table[0][0] = " + table[0][0]);
		System.out.println("table[0][1] = " + table[0][1]);
		System.out.println("table[0][2] = " + table[0][2]);
		System.out.println("table[0][3] = " + table[0][3]);

		System.out.println("table[1][0] = " + table[1][0]);
		System.out.println("table[1][1] = " + table[1][1]);
		System.out.println("table[1][2] = " + table[1][2]);
		System.out.println("table[1][3] = " + table[1][3]);
		
		System.out.println("table[2][0] = " + table[2][0]);
		System.out.println("table[2][1] = " + table[2][1]);
		System.out.println("table[2][2] = " + table[2][2]);
		System.out.println("table[2][3] = " + table[2][3]);
		
		System.out.println("================================");
		
		for(int i=0;i<4;i++)
			System.out.println("table[0][" + i + "] = " + table[0][i]);
		
		for(int i=0;i<4;i++)
			System.out.println("table[1][" + i + "] = " + table[1][i]);
		
		for(int i=0;i<4;i++)
			System.out.println("table[2][" + i + "] = " + table[2][i]);
		
		System.out.println("================================");
		
		for(int k=0;k<3;k++)
			for(int i=0;i<4;i++)
				System.out.println("table[" + k + "][" + i + "] = "
										+ table[k][i]);
		System.out.println("================================");
		
		for(int k=0;k<table.length;k++)
			for(int i=0;i<table[k].length;i++)
				System.out.println("table[" + k + "][" + i + "] = "
										+ table[k][i]);
		
		
		
	}
	
	
}
