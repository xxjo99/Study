package Greedy;

import java.io.*;
import java.util.*;

public class Greedy_1789 {

	public static void main(String[] args) throws IOException {
		// 수들의 합
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;

		st = new StringTokenizer(br.readLine(), " ");
		long n = Long.parseLong(st.nextToken());

		long count = 1;
		long sum = 1;

		while (sum < n) {
			count++;
			sum += count;
		}

		if (sum > n) {
			count--;
		}

		bw.write(count + "\n");

		bw.flush();
		bw.close();
		br.close();
	}

}
