package d1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D1_2068 {

	public static void main(String[] args) throws IOException {
		// 최대수 구하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t =Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for (int i = 1; i <= t; i++) {
			int max = -1;
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 10; j++) {
				int a = Integer.parseInt(st.nextToken());
				if (a > max) {
					max = a;	
				}
			}
			System.out.println("#" + i + " " + max);
		}

	}

}
