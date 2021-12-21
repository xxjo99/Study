package dynamic_Programming;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DP_1003 {
	
	static int fibonachi (int n) {
		if (n == 0) {
			return 0;
		} 
		if (n == 1) {
			return 1;
		}
		return fibonachi(n-1) + fibonachi(n-2);
	}

	public static void main(String[] args) throws IOException {
		// �Ǻ���ġ �Լ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		System.out.println(fibonachi(t));

	}

}
