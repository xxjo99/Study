package sort;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Sort_10989 {

	public static void main(String[] args) throws IOException {
		// 수 정렬하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[10001];
		
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            arr[input]++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= 10000; i++) {
            for (int j = 0; j < arr[i]; j++) {
                sb.append(i + "\n");
            }
        }
 
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
	    
        bw.flush();
        bw.close();
        br.close();
	}

}
