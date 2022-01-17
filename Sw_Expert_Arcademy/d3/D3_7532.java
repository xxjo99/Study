package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D3_7532 {

	public static void main(String[] args) throws IOException {
		// 세영이의 SEM력 연도
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int test = 1; test <= t; test++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int s_ = 1; // 365
			int e_ = 1; // 24
			int m_ = 1; // 29
			int count = 1;
			
			while (s_ != s || e_ != e || m_ != m) {
				s_++;
				e_++;
				m_++;
				count++;
				
				if (s_ > 365) {
					s_ = 1;
				}
				if (e_ > 24) {
					e_ = 1;
				}
				if (m_ > 29) {
					m_ = 1;
				}
				
			}
			
			System.out.println("#" + test + " " + count);
		}
	}

}
