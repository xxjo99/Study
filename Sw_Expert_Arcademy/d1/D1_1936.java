package d1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D1_1936 {

	public static void main(String[] args) throws IOException {
		// 1대1 가위바위보 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		if (a == 1) {
			if (b == 2) {
				System.out.println("B");
			} else if (b == 3) {
				System.out.println("A");
			}
		} else if (a == 2) {
			if (b == 1) {
				System.out.println("A");
			} else if (b == 3) {
				System.out.println("B");
			}
		} else if (a == 3) {
			if (b == 1) {
				System.out.println("B");
			} else if (b == 2) {
				System.out.println("A");
			}
		}
	}

}
