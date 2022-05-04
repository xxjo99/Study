package d3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class D3_10059 {

	public static void main(String[] args) throws IOException {
		// 유효기간
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= t; test++) {
			String n = br.readLine();
			
			String x = n.substring(0,2);
			String y = n.substring(2,4);
			
			int a = Integer.parseInt(x);
			int b = Integer.parseInt(y);
			
			if (a >= 1 && a <=12) {
				if (b >= 1 && b <= 12) {
					System.out.println("#" + test + " " + "AMBIGUOUS");
				} else {
					System.out.println("#" + test + " " + "MMYY");
				}
			} else if (b >= 1 && b <=12) {
				if (a >= 1 && a <= 12) {
					System.out.println("#" + test + " " + "AMBIGUOUS");
				} else {
					System.out.println("#" + test + " " + "YYMM");
				}
			} else {
				System.out.println("#" + test + " " + "NA");
			}
		}
	}

}
