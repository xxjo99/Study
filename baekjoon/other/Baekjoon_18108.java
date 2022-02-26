package other;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon_18108 {

	public static void main(String[] args) throws IOException {
		// 1998년생인 내가 태국에서는 2541년생?!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		System.out.print(n - 543);

	}

}
