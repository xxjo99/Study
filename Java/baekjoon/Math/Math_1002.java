package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Math_1002 {

	public static void main(String[] args) throws IOException {
		// �ͷ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		for (int test = 0; test < t; test++) {
			int[] arr = new int[6];
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			int a = (int) (Math.pow(arr[3] - arr[0], 2) + Math.pow(arr[4] - arr[1], 2));

			// �� ���� �߽��� ����, �������� ���� �� ( ������ ������ ������ �� )
			if (arr[0] == arr[3] && arr[1] == arr[4] && arr[2] == arr[5]) {
				System.out.println(-1);
			} else if (a > Math.pow(arr[5] + arr[2], 2)) { // �� �� ������ �Ÿ��� �� ���� �������� �պ��� Ŭ �� (������
															// ���� ��)
				System.out.println(0);
			} else if (a < Math.pow(arr[5] - arr[2], 2)) { // �� �ȿ� ���� ������ �������� ���� �� (������ ���� ��)
				System.out.println(0);
			} else if (a == Math.pow(arr[5] - arr[2], 2)) { // ����
				System.out.println(1);
			} else if (a == Math.pow(arr[5] + arr[2], 2)) { // ����
				System.out.println(1);
			} else { // ���� 2��
				System.out.println(2);
			}

		}

	}

}
