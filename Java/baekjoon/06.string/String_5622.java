package string;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class String_5622 {

	public static void main(String[] args) throws IOException {
		// ´ÙÀÌ¾ó
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		String a = br.readLine();
		
		int count = 0;
		int k = a.length();
		
		for (int i = 0; i<k; i++) {
			switch(a.charAt(i)) {
			
			case 'A' : case 'B' : case 'c' :
				count += 3;
				break;
				
			case 'D' : case 'E' : case 'F' :
				count += 4;
				break;
				
			case 'G' : case 'H': case 'I' :
				count += 5; 
				break;
				
			case 'J' : case 'K': case 'L' :
				count += 6; 
				break;
				
			case 'M' : case 'N': case 'O' :
				count += 7; 
				break;
				
			     
			case 'P' : case 'Q': case 'R' : case 'S' : 
				count += 8; 
				break;
			               
			case 'T' : case 'U': case 'V' : 
				count += 9;
				break;
			                
			case 'W' : case 'X': case 'Y' : case 'Z' : 
				count += 10;
				break;
			}
		}
		System.out.print(count);	
		
		br.close();
	}

}
