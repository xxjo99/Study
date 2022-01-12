package math2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Math2_3009 {

	public static void main(String[] args) throws IOException {
		// 네번째 점
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		int x1 = Integer.parseInt(st1.nextToken());
		int y1 = Integer.parseInt(st1.nextToken());
		
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		int x2 = Integer.parseInt(st2.nextToken());
		int y2 = Integer.parseInt(st2.nextToken());
		
		StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");
		int x3 = Integer.parseInt(st3.nextToken());
		int y3 = Integer.parseInt(st3.nextToken());
		
		int x4, y4 = 0;
		
		if (x1 == x2) { // x값 비교
			x4 = x3;
		} else if (x1 == x3) {
			x4 = x2;
		} else {
			x4 = x1;
		}
		
		if (y1 == y2) { // y값 비교
			y4 = y3;
		} else if (y1 == y3) {
			y4 = y2;
		} else {
			y4 = y1;
		}
		
		System.out.println(x4 + " " + y4);
	}
}