package d2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D2_1979 {

	public static void main(String[] args) throws IOException {
		// ��� �ܾ �� �� ������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= t; test++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken()); // ���� ũ�� n x n
			int k = Integer.parseInt(st.nextToken()); // �ܾ� ����
			
			// ���� �迭 ����
			int[][] arr = new int[n][n];
			for (int i = 0; i < n; i++) {
				StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < n; j++) {
					arr[i][j] = Integer.parseInt(st2.nextToken());
				}
			}
			
			int count = 0;
			
			// ����
			for (int i = 0; i < n; i++) {
				int sum = 0;
				for (int j = 0; j < n; j++) {
					if (arr[i][j] == 1) {
						sum++;
						if (sum == k) {
							count++;
							break;
						}
					} else {
						sum = 0;
					}
				}
			}
			
			//����
			for (int i = 0; i < n; i++) {
				int sum = 0;
				for (int j = 0; j < n; j++) {
					if (arr[j][i] == 1) {
						sum++;
						if (sum == k) {
							count++;
							break;
						}
					} else {
						sum = 0;
					}
				}
			}
			
			System.out.println(count);
				
		}
		
	}

}
