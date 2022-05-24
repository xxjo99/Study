package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sort_1443 {

	public static void main(String[] args) throws IOException {
		// »ðÀÔÁ¤·Ä
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		int[] arr= new int[t];
		for (int i = 0; i < t; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		insertsort(arr, t);
		
		for (int i : arr) {
			System.out.println(i);
		}
		
	}
	
	public static void insertsort(int[] arr, int t) {
		int temp = 0;
		int j;
		for (int i = 1; i < t; i++) {
			temp = arr [i];
			for (j = i-1; j >= 0 && arr[j] > temp; j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		}
	}

}
