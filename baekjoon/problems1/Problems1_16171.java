package problems1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Problems1_16171 {

    public static void main(String[] args) throws IOException {
        // 스네이크버드
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    	int n = Integer.parseInt(st.nextToken());
    	int l = Integer.parseInt(st.nextToken());
    	
    	int[] arr = new int[n];
    	StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
    	for (int i = 0; i < n; i++) {
    		arr[i] = Integer.parseInt(st2.nextToken());
    	}
    	Arrays.sort(arr);
    	
    	int i = 0;
    	while(i < n) {
    		if (l >= arr[i]) {
    			l++;
    			i++; 
    		} else {
    			break;
    		}
    	}
    	
    	System.out.println(l);
    }
}
