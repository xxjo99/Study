package basic100;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Ex91 {

	public static void main(String[] args) throws IOException {
		// [����-1�����迭] �̻��� �⼮ ��ȣ �θ���1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[23];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(st.nextToken());
			arr[a-1]++;
		}
		
		for (int val:arr) {
			System.out.print(val + " ");
		}
		
		
		
	}

}
