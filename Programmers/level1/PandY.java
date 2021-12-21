package level1;

public class PandY {

	static boolean solution(String s) {

		s = s.toLowerCase();
		int pcount = 0;
		int ycount = 0;

		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if (a == 'p') {
				pcount++;
			}
			if (a == 'y') {
				ycount++;
			}
		}

		if (pcount == ycount) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// 문자열 내 p와 y의 개수
		String s = "Pyy";
		System.out.println(solution(s));

	}

}
