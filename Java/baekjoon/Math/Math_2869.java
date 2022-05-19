package math1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Math_2869 {

	public static void main(String[] args) throws IOException {
		// 달팽이는 올라가고 싶다
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		double x = v-a;
		int y = a-b;
		double z =  x /y;
		double t = Math.ceil(z) + 1;
		
		int result = (int)t;
		
		System.out.println(result);

	}

}
