package level1;

public class StringBasic {

	public static boolean solution(String s) {
		char[] c = s.toCharArray();
		
		if (c.length != 4 && c.length != 6) {
			return false;
		}
		
		for (int i = 0; i < c.length; i++) {
			if (!(c[i] >= '0' && c[i] <= '9')) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// ���ڿ� �ٷ�� �⺻
		String s = "1234";
		System.out.println(solution(s));

	}

}
