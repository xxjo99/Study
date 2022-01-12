package sort;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;

public class Sort_10814 {

	public static void main(String[] args) throws IOException {
		// ���̼� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[][] arr = new String[n][2];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = st.nextToken(); // ����
			arr[i][1] = st.nextToken(); // �̸�
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {
			public int compare(String[] one, String[] two) {
				return Integer.parseInt(one[0]) - Integer.parseInt(two[0]);
			}
		});
		
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}

	}

}
