package problems1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Problems1_2947 {
	
    public static void main(String[] args) throws IOException {
        // ��������
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[5];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 5; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int i = 0; i < 4; i++) {
        	for (int j = i+1; j < 5; j++) {
        		if (arr[i] > arr[j]) {
        			int x = arr[i];
        			arr[i] = arr[j];
        			arr[j] = x;
        			for (int k : arr) {
        				System.out.print(k);
        			}	
        			System.out.println();
        		}
        	}
        }
        
    }
}
