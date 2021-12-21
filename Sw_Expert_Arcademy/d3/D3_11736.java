package d3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class D3_11736 {

	public static void main(String[] args) throws IOException {
		// µÎ Àü±¸
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= t; test++) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int count = 0;
			for (int i = 1; i < arr.length-1; i++) {
				int max = 0;
				int min = 21;
				for (int j = i-1; j <= i+1 ; j++) {
					if (arr[j] > max) {
						max = arr[j];
					}
					if (arr[j] < min) {
						min = arr[j];
					}
				}
				
				if (arr[i] != max && arr[i] != min) {
					count++;
				}
			}
			
			System.out.println("#" + test + " " + count);			
		}
	}

}
