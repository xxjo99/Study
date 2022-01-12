package sort;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;;

public class Sort_1181 {

	public static void main(String[] args) throws IOException {
		// 단어 정렬
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) {
                	return 1;
                } else if(o1.length() == o2.length()) {
                	return 0;
                } else {
                	return -1;
                }
            }
        });
		
        for (int i = 0; i < n; i++) {
            int j;
            for (j = i+1; j < n; j++) {
                if(arr[i].length() != arr[j].length()) {
                	break;
                }
            }
            Arrays.sort(arr, i,j);
            i = j-1;
        }
        
        System.out.println(arr[0]);
        for (int i = 1; i < n; i++) {
            if(arr[i-1].equals(arr[i])) {
            	continue;
            }
            System.out.println(arr[i]);
        }
		
	}

}
