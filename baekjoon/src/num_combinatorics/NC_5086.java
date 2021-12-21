package num_combinatorics;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class NC_5086 {

	public static void main(String[] args) throws IOException {
		// ����� ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if (a == 0 && b == 0) {
				break;
			}
			
			if (a > b) {
				if (a % b == 0) {
					System.out.println("multiple");
				} else {
					System.out.println("neither");
				}
			} else {
				if (b % a == 0) {
					System.out.println("factor");
				} else {
					System.out.println("neither");
				}
			}
			
		}
		
	}

}
