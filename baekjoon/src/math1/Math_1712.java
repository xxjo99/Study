package math1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Math_1712 {

	public static void main(String[] args) throws IOException {
		// 손익분기점
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()); // 고정비용
		int b = Integer.parseInt(st.nextToken()); // 생산비용
		int c = Integer.parseInt(st.nextToken()); // 노트북 가격
		
		if (c <= b) {
			System.out.println("-1");
		} 
		else {
			System.out.println((a/(c-b)+1));
		}

	}

}
