package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D3_3142 {

	public static void main(String[] args) throws IOException {
		// �����̿� �ź��� ���� ��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int test = 1; test <= t; test++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int x = n - m; // Ʈ��ȥ
			int y = m - x; // ������
			
			System.out.println("#" + test + " " + y + " " + x);
		}
	}

}
