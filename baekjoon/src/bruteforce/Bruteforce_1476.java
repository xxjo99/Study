package bruteforce;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Bruteforce_1476 {

	public static void main(String[] args) throws IOException {
		// 날짜 계산
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// (1 ≤ E ≤ 15, 1 ≤ S ≤ 28, 1 ≤ M ≤ 19)
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int e = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int E = 1;
		int S = 1;
		int M = 1;
		
		int count = 1;
		while (E != e || M != m || S != s) {
			E++;
			S++;
			M++;
			count++;
			if (E > 15) {
				E = 1;
			}
			if (S > 28) {
				S = 1;
			}
			if (M > 19) {
				M = 1;
			}
		}
		
		System.out.println(count);	
		
	}

}
