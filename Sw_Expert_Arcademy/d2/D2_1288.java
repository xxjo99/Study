package d2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class D2_1288 {

	public static void main(String[] args) throws IOException {
		// 새로운 불면증 치료법
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= t; test++) {
			int n = Integer.parseInt(br.readLine());
			ArrayList<Integer> list = new ArrayList<Integer>();
			int count = 1;
			
			while (list.size() != 10) {
				int num = 0;
				num = count * n;
				
				while (num != 0) {
					int a = num % 10;
					if (!list.contains(a)) {
						list.add(a);
					}
					num /= 10;
				}
				count++;
			}
			
			System.out.println("#" + test + " " + count);
			
			
		}
		
	}

}
