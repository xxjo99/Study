package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sort_1441 {

	public static void main(String[] args) throws IOException {
		// 버블정렬
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		int[] arr= new int[t];
		for (int i = 0; i < t; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		bubblesort(arr, t);
		
		for (int i : arr) {
			System.out.println(i);
		}
		
	}
	
	public static void swap(int[] arr, int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
	
	public static void bubblesort(int[] arr, int t) {
		for (int i = 0; i < t-1; i++) {
			for (int j = t-1; j > i; j--) {
				if (arr[j-1] > arr[j]) {
					swap(arr, j-1, j);
				}
			}
		}
	}

}
