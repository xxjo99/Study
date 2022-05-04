package level1;

public class PhoneNumber {
	
    public static String solution(String phone_number) {
        StringBuilder sb = new StringBuilder(phone_number);
        for (int i = 0; i < phone_number.length() - 4; i++) {
        	sb.replace(i, i+1, "*");
        }
        String answer = sb.toString();
        return answer;
    }

	public static void main(String[] args) {
		// 핸드폰 번호 가리기
		String phone_number = "01033334444";
		System.out.println(solution(phone_number));
	}

}
