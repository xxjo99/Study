package level1;

public class GCD_LCM {

	public static int[] solution(int n, int m) {
		int[] answer = new int[2];

		answer[0] = gcd(n, m);
		answer[1] = n * m / answer[0];
		
		return answer;
	}
	
	static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		
		return a;
	}


	public static void main(String[] args) {
		// 최대공약수와 최소공배수
		int n = 3;
		int m = 12;
		int[] answer = solution(n, m);
		for (int i : answer) {
			System.out.println(i);
		}

	}

}
