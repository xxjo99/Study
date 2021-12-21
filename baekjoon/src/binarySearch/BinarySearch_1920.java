package binarySearch;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class BinarySearch_1920 {
	
	public static int binarySearch(int[] arr1, int num) {
		int low = 0;
		int high = arr1.length-1;
		int mid = 0;
		
		while (low <= high) {
			mid = (low + high) / 2;
			if  (arr1[mid] == num) {
				return 1;
			} else if (arr1[mid] > num) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		
		return 0;
	}

	public static void main(String[] args) throws IOException {
		// ¼ö Ã£±â
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr1 = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr1);
		
		int m = Integer.parseInt(br.readLine());
		int[] arr2 = new int[m];
		
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < m; i++) {
			arr2[i] = Integer.parseInt(st1.nextToken());
		}
		
		for (int i = 0; i < m; i++) {
			System.out.println(binarySearch(arr1, arr2[i]));
		}

	}

}
