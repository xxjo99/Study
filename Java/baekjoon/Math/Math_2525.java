package math;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math_2525 {

	public static void main(String[] args) throws IOException {
		// ���� �ð�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int hour = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(br.readLine());

		min += a;
		if (min >= 60) {
			while (min >= 60) {
				min -= 60;
				hour++;
				if (hour >= 24) {
					hour = 0;
				}
			}
		}
		System.out.println(hour + " " + min);

	}

}
