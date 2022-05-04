package d2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class D2_1983 {

	public static void main(String[] args) throws IOException {
		// 조교의 성적 매기기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] score = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};		
		int t = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= t; test++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st1.nextToken());
			int m = Integer.parseInt(st1.nextToken());
			Double[] arr = new Double[n];
			double find = 0.0;
			
			for (int i = 0; i < n; i++) {
				StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
				int a = Integer.parseInt(st2.nextToken());
				int b = Integer.parseInt(st2.nextToken());
				int c = Integer.parseInt(st2.nextToken());
				
				double sum = (0.35 * a) + (0.45 * b) +( 0.2 * c);
				arr[i] = sum;
				
				if (m == i+1) {
					find = sum;
				}
			}
			
			Arrays.sort(arr, Collections.reverseOrder());
			
			int index = 0;
			
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == find) {
					index = i;
				}
			}
			
			index = index / (n/10);
			
			System.out.println("#" + test + " " + score[index]);
			
		}
		
	}

}
