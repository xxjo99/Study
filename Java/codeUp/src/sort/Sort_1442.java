package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sort_1442 {

	public static void main(String[] args) throws IOException {
		// 선택정렬
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		int[] arr= new int[t];
		for (int i = 0; i < t; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		selectionsort(arr, t);
		
		for (int i : arr) {
			System.out.println(i);
		}
		
	}
	
	public static void swap(int[] arr, int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
	
	public static void selectionsort(int[] arr, int t) {
		for (int i = 0; i < t; i++) {
			int min = arr[i];
			int temp = i;
			
			for (int j = i; j < t; j++) {
				if (arr[j] < min) {
					min = arr[j];
					temp = j;
				}
			}
			
			swap(arr, i, temp);
		}
	}

}
