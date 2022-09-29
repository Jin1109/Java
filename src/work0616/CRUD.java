package work0616;

import java.util.ArrayList;
import java.util.Map;

//emp의 모든 정보를 조회하는 클래스를 통해 가져온 데이터를 출력합니다.
public class CRUD {
	// CRUD:컴퓨터 소프트웨어가 가지는 기존적인 데이터 처리 기능
	// C(create-insert), R(Read-select)
	// U(Update-update), D(Delete-delete)
	static String menus[] = { "사원번호", "사원이름", "직급","매니저", "입사일자", "급여", "커미션", "부서번호", "종료 " };
	
	public static void main(String[] args) {
		selectAll();
	}
	
	private static void selectAll() {
		DAO dao = new DAO();
		ArrayList<Map<String, Object>> e = dao.selectAll();
		
		if (e == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.printf("%s\t%s\t%s\t\t%s\t%s\t\t%s\t%s\t%s\t\n", menus[0], menus[1], menus[2], menus[3],
					menus[4], menus[5], menus[6], menus[7]);
			System.out.println("===========================================================================");
			//for (Emp s : e)
			for (Map<String, Object>s : e) {
				System.out.printf("%-8s%-8s%-16s%s\t%-16s%s\t%s\t%s\t\n",
									s.get("empno"),
									s.get("ename"),
									s.get("job"),
					                s.get("mgr"),
					                s.get("hiredate"),
					                s.get("sal"),
					                s.get("comm"),
					                s.get("deptno"));
			}
		}
	}
}