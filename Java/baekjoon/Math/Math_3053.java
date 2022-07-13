package math;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Math_3053 {

	public static void main(String[] args) throws IOException {
		// ���μ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double n = Double.parseDouble(br.readLine());
		
		System.out.println(n * n * Math.PI);
		System.out.println(2 * n * n);

	}
}