package chapter2;

// ** 복습할 때 자세히 더 찾아보기

// JVM : 자바 가상 기계
// 실제 컴파일된 코드를 실행하는 기계
// 별도의 메모리 구조를 가지고 있음.

// Method Area (메서드 영역)
// : 모든 곳에서 공유 가능한 영역, 각 클래스의 구조를 저장하고 있음.

// Heap Area (힙 영역)
// : 모든 곳에서 공유 가능한 영역, 인스턴스 혹은 배열과 같은 new 연산자를 통해 생성된 객체들이 저장되는 영역

// Stack Area (스택 영역)
// : 각 스레드 (실행 중인 프로세스) 별로 독립적으로 존재하는 영역, 메서드 호출과 로컬 변수에 대한 정보가 저장됨.
//   각 코드 블럭마다 하나의 스택 생성됨.
//   메서드 호출 후 메모리에서 사라짐 (그러므로 반복 작업 가능)

class ExampleClass2 {
	int instanceVariable;
	static int staticVariable;
	
	void instanceMethod () {
		int instanceMethodVariable = 10;
		ExampleClass2 instance = new ExampleClass2();
	}
	
	static void staticMethod () {
		int staticMethodVariable = 10;
	}
}

public class JVM {

	public static void main(String[] args) {
		
		int localVariable1 = 20;
		double localVariable2 = 3.5;
		
		if (localVariable1 > 0) {
			int codeBlock1 = 30;
			localVariable1 = codeBlock1;
		}
		
		ExampleClass2 instance1 = new ExampleClass2();
		ExampleClass2 instance2 = new ExampleClass2();
		
		instance1.instanceVariable = 10;
		instance2.instanceVariable = -99;
		
		instance1.staticVariable = 55;
		
		instance1.instanceMethod();
		
		method1(localVariable1);
		System.out.println(localVariable1); // method1 호출 후 변하지 않음.
		
		method2(instance1);
		System.out.println(instance1.instanceVariable); // method2 호출 후 변함

	}
	
	// 기본형 매개변수: 값이 복사되어, 변수의 값을 읽기만 할 수 있다.
	static void method1(int arg) {
		arg = 99999;
	}
	
	// 참조형 매개변수: 인스턴스의 주소가 복사되어, 변수의 값을 읽고 변경할 수 있다.
	static void method2(ExampleClass2 arg) {
		arg.instanceVariable = 99999;
	}

}











