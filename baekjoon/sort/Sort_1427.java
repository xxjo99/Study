package sort;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Sort_1427 {

	public static void main(String[] args) throws IOException {
		// ��Ʈ �� ���̵�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] arr = br.readLine().toCharArray();
		Arrays.sort(arr);
		
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		
		br.close();

	}

}
