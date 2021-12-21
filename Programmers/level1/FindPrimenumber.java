package level1;

public class FindPrimenumber {

	public static int solution(int n) {
		int answer = 0;
		boolean[] sosu = new boolean[n + 1];

		for (int i = 2; i <= n; i++) {
			sosu[i] = true;
		}
		
		int root = (int) Math.sqrt(n);

		for (int i = 2; i <= root; i++) {
			if (sosu[i] == true) {
				for (int j = i; i * j <= n; j++) {
					sosu[i * j] = false;
				}
			}
		}
		
		for (int i = 2; i <= n; i++) {
			if (sosu[i] == true) // �Ҽ��� ���� ����
				answer++;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// �Ҽ�ã��
		int n = 10;
		System.out.println(solution(n));
	}

}
