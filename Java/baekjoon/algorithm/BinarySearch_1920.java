package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class BinarySearch_1920 {
	
	public static int binarySearch(int[] arr, int key) {
		int lo = 0;
		int hi = arr.length - 1;
		
		while (lo <= hi) {
			
			int mid = (lo + hi) / 2;
			
			if (key < arr[mid]) {
				hi = mid - 1;
			} else if (key > arr[mid]) {
				lo = mid + 1;
			} else {
				return 1;
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int[] arr = new int[a];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < a; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		 
		int b = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < b; i++) {
			int n = Integer.parseInt(st.nextToken());
			sb.append(binarySearch(arr, n)).append('\n');			
		}
		
		System.out.println(sb);
		
	}

}
