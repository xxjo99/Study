package math;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Math_1929 {

	public static void main(String[] args) throws IOException {
		// �Ҽ� ���ϱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		boolean[] prime = new boolean[b+1];
		
		prime[0] = prime[1] = true;
		
		for (int i = 2; i <= Math.sqrt(b+1); i++) {
			for (int j = i*i; j < b+1; j += i) {
				prime[j] = true;
			}
		}
		
		for (int i = a; i < b+1; i++) {
			if (prime[i] == false) {
				System.out.println(i);
			}
		}
		
	}
}