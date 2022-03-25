package basic100;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Ex93 {

	public static void main(String[] args) throws IOException {
		// [기초-1차원배열] 이상한 출석 번호 부르기3
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int min = 24;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < arr.length; i++) {
			int a = Integer.parseInt(st.nextToken());
			arr[i] = a;
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println(min);
		
		
		
	}

}
