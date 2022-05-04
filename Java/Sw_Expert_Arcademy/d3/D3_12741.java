package d3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class D3_12741 {

	public static void main(String[] args) throws IOException {
		// µÎ Àü±¸
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= t; test++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int xs = Integer.parseInt(st.nextToken());
			int xf = Integer.parseInt(st.nextToken());
			int ys = Integer.parseInt(st.nextToken());
			int yf = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[101];
			for (int i = xs+1; i <= xf; i++) {
				arr[i]++;
			}
			for (int i = ys+1; i <= yf; i++) {
				arr[i]++;
			}
			
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 2) {
					count++;
				}
			}
			
			System.out.println("#" + test + " " + count);
		}
	}

}
