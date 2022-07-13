package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Math_1712 {

	public static void main(String[] args) throws IOException {
		// ���ͺб���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken()); // �������
		int b = Integer.parseInt(st.nextToken()); // ������
		int c = Integer.parseInt(st.nextToken()); // ��Ʈ�� ����

		if (c <= b) {
			System.out.println("-1");
		} else {
			System.out.println((a / (c - b) + 1));
		}

	}

}
