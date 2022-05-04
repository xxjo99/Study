package d1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class D1_2050 {

	public static void main(String[] args) throws IOException {
		// 알파벳을 숫자로 변환
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		for (int i = 0; i < a; i++) {
			System.out.print("#");
		}
	}

}
