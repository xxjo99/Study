package d1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class D1_1545 {

	public static void main(String[] args) throws IOException {
		// �Ųٷ� ����� ���ƿ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = n; i >= 0; i--) {
			System.out.print(i + " ");
		}
	}

}
