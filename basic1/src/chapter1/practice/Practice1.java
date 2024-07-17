package chapter1.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {
	
	// 사용자로부터 0이상의 정수를 입력받고 
	// 입력받은 숫자를 numbers라고 하는 배열에 저장함.
	// 만약 사용자가 0미만의 정수를 입력하면
	// 사용자가 입력했던 정수들을 모두 출력하고 프로그램을 종료

	public static void main(String[] args) {
		
		// 사용자에게 정수를 입력받을 스캐너
		Scanner scanner = new Scanner(System.in);
		
		// 사용자로부터 입력받은 숫자를 저장할 배열 
		int[] numbers = new int[0];
		
		// 무한정으로 돌아가는 while 문 
		while (true) {
			// 정수를 입력받음. 그 정수를 변수에 저장
			System.out.print("정수 : ");
			int inputNumber = scanner.nextInt();
			
			// 만약 사용자가 0미만 정수를 입력하면 종료
			if (inputNumber < 0) break;
			
			// 기존 배열의 길이를 늘려줌.
			int[] newNumbers = new int[numbers.length + 1];
			
			// 입력받은 값을 새로운 값이 들어가는 배열의 끝으로 넣어줌.
			newNumbers[newNumbers.length - 1] = inputNumber;
			
			// (추가하는 만큼 늘어나는) numbers 배열에 그 길이만큼 계속해서 
			// 기존 numbers 배열의 값들이 있는 index를 새로운 값이 들어있는 index에 넘겨줌.
			// 그로인해 계속해서 합쳐져서 완성된 배열이 만들어짐.
			for (int index = 0; index < numbers.length; index++) {
				newNumbers[index] = numbers[index];
			}
			
			// 최종적으로 위에서 만들어진 newNumbers 배열을 사용자로부터 입력받은 숫자를 저장할 배열인 numbers 배열에 할당시켜 줌.
			numbers = newNumbers;
		}
		
//		for (int number: numbers) System.out.println(number);
		
		// Arrays.toString(배열 변수명);
		// 배열을 문자열로 출력 : ex) [1, 2, 3,]
		System.out.println(Arrays.toString(numbers));
		
		scanner.close();
		
	}

}
