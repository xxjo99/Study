package basic100;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Ex92 {

	public static void main(String[] args) throws IOException {
		// [기초-1차원배열] 이상한 출석 번호 부르기2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < arr.length; i++) {
			int a = Integer.parseInt(st.nextToken());
			arr[i] = a;
		}
		
		for (int i = n-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		
		
		
	}

}
