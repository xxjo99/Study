package basic100;
import java.util.Scanner;

public class Ex90 {

	public static void main(String[] args) {
		// πŸµœ∆«ø° »Ú µπ ≥ı±‚
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[][] arr = new int[20][20];
        
        for (int i = 0; i<n; i++) {
        	int x = sc.nextInt();
        	int y = sc.nextInt();
        	arr[x-1][y-1] = 1;
        }
        
        for(int i=0;i<19;i++) {
            for(int j=0;j<19;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }        	
        	
		sc.close();
	}

}
