package Greedy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Greedy_1026 {

	public static void main(String[] args) throws IOException {
		// º¸¹°
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] Aarr = new int[n];
		int[] Barr = new int[n];
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			Aarr[i] = Integer.parseInt(st1.nextToken());
		}
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			Barr[i] = Integer.parseInt(st2.nextToken());
		}
		
		Arrays.sort(Aarr);
		Arrays.sort(Barr);
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += Aarr[i] * Barr[n-1-i];
		}
		
		System.out.println(sum);
		

	}

}
