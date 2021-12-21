package sort;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Sort_2751 {

	public static void main(String[] args) throws IOException {
		// 수 정렬하기2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		
	    Collections.sort(arr);

	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < n; i++) {
	    	sb.append(arr.get(i) + "\n");
	    }

	    bw.write(sb.toString());
	    
        bw.flush();
        bw.close();
        br.close();
	}

}
