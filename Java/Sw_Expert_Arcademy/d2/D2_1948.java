package d2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D2_1948 {

	public static void main(String[] args) throws IOException {
		// 날짜 계산기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int t = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= t; test++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int amonth = Integer.parseInt(st.nextToken()) - 1;
			int aday = Integer.parseInt(st.nextToken());
			int bmonth = Integer.parseInt(st.nextToken()) - 1;
			int bday = Integer.parseInt(st.nextToken());
			
			int sum = day[amonth]-aday+1;
			
			for(int i = amonth+1; i <= bmonth; i++) {
				sum += day[i];
			}
			
			sum -= day[bmonth]-bday;
            
			System.out.println("#" + test+" "+sum);

		}
		
	}

}
