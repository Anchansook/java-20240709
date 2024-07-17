package chapter1.practice;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		
		// 모두 대문자로 만들기
		// 사용자로부터 문자열 statement를 입력받고
		// 입력 받은 문자열을 영어라면 모두 대문자로 변경하여
		// 문자 배열에 저장한 후 출력
		
		// 사용자한테 문자열 입력받기
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String statement = scanner.nextLine();
		
		scanner.close();
		
		// 입력받은 문자열 문자 배열로 변환하기
		char[] statementChars = statement.toCharArray();
		
		for (int index = 0; index < statementChars.length; index++) {
			
			// 문자 배열을 charater 변수에 할당
			char charater = statementChars[index];
			
			// 아스키코드 이용 : 문자열이 소문자다.
			// 아스키코드 : 소문자 값에 -32를 한 값이 대문자
			boolean lowerEnglish = charater >= 97 && charater <= 122;
			
			if (!lowerEnglish) continue;
			
			statementChars[index] -= 32;
			// or
//			statementChars[index] = (char)(charater - 32);
		}
		
		System.out.println(statementChars);

	}

}
