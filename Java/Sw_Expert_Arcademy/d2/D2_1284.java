package d2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D2_1284 {

	public static void main(String[] args) throws IOException {
		// 수도 요금 경쟁
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= t; test++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int p = Integer.parseInt(st.nextToken()); // A사 1L당 요금
			int q = Integer.parseInt(st.nextToken()); // B사 r리터이하 기본요금
			int r = Integer.parseInt(st.nextToken()); 
			int s = Integer.parseInt(st.nextToken()); // r리터를 초과했을시 L당 요금
			int w = Integer.parseInt(st.nextToken()); // 사용 수도의 양
			
			int A = p * w;
			int B = 0;
			
			if (w <= r) {
				B = q;
			} else {
				B = q +  (w-r) * s;
			}
			
			int result = (A < B ? A : B);
			System.out.println("#" + test + " " + result);
			
		}
		
	}

}
