package chapter1.practice;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		
		// 문자열 자르기
		// 사용자로부터 시작 인덱스와 종료 인덱스를 입력받고
		// 입력 받은 시작 인덱스와 종료 인덱스까지 문자열을 잘라서 
		// 자른 문자열을 출력
		
		// string 기능 substring을 사용하지 않고 char[]을 이용해서 작성
		
		String statment = "내가 그린 기린 그림은 잘 그린 기린 그림이고 네가 그린 기린 그림은 잘 못그린 기린 그림이다.";
		
		// 사용자로부터 시작 인덱스와 종료 인덱스 입력 받기
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("시작 인덱스 : ");
		int startIndex = scanner.nextInt();
		
		System.out.println("종료 인덱스 : ");
		int endIndex = scanner.nextInt();
		
		scanner.close();
		
		// statment 문자열을 문자 배열로 변환
		char[] statementChars = statment.toCharArray();
		
		// 잘라서 저장할 배열 : 종료 인덱스 - 시작 인덱스
		char[] resultChars = new char[endIndex - startIndex];
		
		for (int index = 0; index < resultChars.length; index++) {
			// 인덱스가 0부터 시작하기 때문에 시작 인덱스에 기존 인덱스를 더한다.
			resultChars[index] = statementChars[startIndex + index];
		}
		
		System.out.println(resultChars);

	}

}
