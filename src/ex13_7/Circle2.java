package ex13_7;
class Circle2 {
	int radius;				//반지름
	Circle2(int radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return "radius=" + radius;
	}
	
	//obj가 Object타입이므로 radius르 참조하기위해서 Circle2타입으로 형변환이 필요
	public boolean equals(Object obj) {
		/*	obj가 null이 아니고 obj를 Circle2로 형변환하고
		 	조건을 만족하면 obj1를 Circle2로 형변환하고
		 	형변환한 obj의 radius값과 현재 객체이 radius값을 비교해서 가틍면
		 	
		 	위 조건을 만족하지 않으면 false 리턴합니다. 
		 */
		if (obj != null && obj instanceof Circle2) {
			Circle2 obj2 = (Circle2)obj;
			return this.radius == obj2.radius;	
		}else {
			return false;
		}
	}
}
