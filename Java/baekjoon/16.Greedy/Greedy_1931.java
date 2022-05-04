package Greedy;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;

public class Greedy_1931 {

	public static void main(String[] args) throws IOException {
		// 회의실 배정
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] time = new int[n][2]; // 회의시간을 저장할 배열
		
		StringTokenizer st;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			time[i][0] = Integer.parseInt(st.nextToken()); // 시작시간
			time[i][1] = Integer.parseInt(st.nextToken()); // 종료시간
		}
		
		Arrays.sort(time, new Comparator<int[]>() {
			
			public int compare(int[] t1, int[] t2) {
				if(t1[1] == t2[1]) {
					return t1[0] - t2[0];
				}
				return t1[1] - t2[1];
			}
		});
		
		int count = 0;
		int prev_end_time = 0;
		
		for (int i = 0; i < n; i++) {
			if(prev_end_time <= time[i][0]) {
				prev_end_time = time[i][1];
				count++;
			}
		}
		
		bw.write(count + "\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
