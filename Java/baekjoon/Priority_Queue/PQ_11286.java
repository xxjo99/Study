package Priority_Queue;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class PQ_11286 {

	public static void main(String[] args) throws IOException {
		// ���밪 ��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		PriorityQueue<Integer> que = new PriorityQueue<>(
				(o1, o2) -> Math.abs(o1) == Math.abs(o2) ? Integer.compare(o1, o2)
						: Integer.compare(Math.abs(o1), Math.abs(o2)));

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());

			if (num == 0)
				sb.append(que.size() == 0 ? 0 : que.poll()).append('\n');
			else
				que.add(num);
		}
		System.out.println(sb.toString());

	}

}
