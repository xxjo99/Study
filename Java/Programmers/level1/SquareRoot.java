package level1;

public class SquareRoot {

	public static long solution(long n) {
	      Double sqrt = Math.sqrt(n);
	      
	      if(sqrt == sqrt.intValue()){
	          return (long) Math.pow(sqrt + 1, 2);
	      } else {
	    	  return -1;
	      }
	}

	public static void main(String[] args) {
		// ���� ������ �Ǻ�
		long n = 3;
		System.out.println(solution(n));
	}

}
