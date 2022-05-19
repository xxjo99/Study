package math2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Math2_1085 {

	public static void main(String[] args) throws IOException {
		// 직사각형에서의 탈출
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int m = w - x;
		int n = h - y;
		
		int min1 = Math.min(m ,x);
		int min2 = Math.min(n ,y);
		
		System.out.println(Math.min(min1,  min2));
	}
}