package level1;

public class Harshadnumber {

	public static boolean solution(int x) {
		int a = x;
		int sum = 0;
		while (a != 0) {
			sum += a % 10;
			a = a / 10;
		}
		
		if (x % sum == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// ÇÏ»þµå ¼ö
		int x = 11;
		System.out.println(solution(x));

	}

}
