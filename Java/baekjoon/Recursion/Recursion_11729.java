package recursion;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Recursion_11729 {
	
	public static int count = 0;
	
	public static void hanoi(int n, int x, int y) {
		if (n > 1) {
			hanoi(n - 1, x, 6 - x - y);
		}
		
		System.out.println(x + " " + y);
		count++;
		
		if (n > 1) {
			hanoi(n - 1, 6 - x - y, y);
		}
	}

	public static void main(String[] args) throws IOException {
		// ÆÑÅä¸®¾ó
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		hanoi(n, 1, 3);
	}

}
