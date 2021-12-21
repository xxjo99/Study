package Greedy;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Greedy_13305 {

	public static void main(String[] args) throws IOException {
		// 주유소
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()); // 도시 개수
		
		// 도시의 길이
		long[] road = new long[n-1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < road.length; i++) {
			road[i] = Long.parseLong(st.nextToken());
		}
		
		// 연료 비용
		long[] fuel = new long[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < fuel.length; i++) {
			fuel[i] = Long.parseLong(st.nextToken());
		}
		
		long min = Long.MAX_VALUE;
		long sum = 0;
		for (int i = 0; i < n-1; i++) {
			if (min>fuel[i]) {
				min = fuel[i];
			}
			sum += road[i] * min;
		}
		
		bw.write(sum +"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
