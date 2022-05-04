package d2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D2_1959 {

	public static void main(String[] args) throws IOException {
		// 두 개의 숫자열
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= t; test++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st1.nextToken());
			int m = Integer.parseInt(st1.nextToken());
			int[] narr = new int[n];
			int[] marr = new int[m];
			
			StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < n; i++) {
				narr[i] = Integer.parseInt(st2.nextToken());
			}
			StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < m; i++) {
				marr[i] = Integer.parseInt(st3.nextToken());
			}
			
			int max = -10000;
			
			for (int i = 0; i < m-n+1; i++) {
				int count = 0;
				int mul = 0;
				for (int j = i; j < n+i; j++) {
					mul += narr[count] * marr[j];
					count++;
				}
				
				if (max < mul) {
					max = mul;
				}
			}
			
			System.out.println("#" + test + " " + max);
			
		}
		
	}

}
