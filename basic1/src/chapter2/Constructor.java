package chapter2;

// 생성자 : 클래스의 인스턴스가 생성되는 순간에 호출되는 메서드
// 클래스와 같은 이름을 가지고 있음, 반환타입이 존재하지 않음.
// 클래스명(매개변수, ...) { 인스턴스가 생성될 때 수행할 작업 }

// 클래스 생성
class Human1 {
	//String name = "홍길동"; // 여기서 작업해도 똑같다. 하지만 지양한다.
	String name; 
	int age;
	String gender;
	
	// final로 선언된 인스턴스 변수는 생성자에서 반드시 초기화 해야 함.
	// 즉, 필수 값
	final String address;
	
	// 생성자 정의 : 메서드지만 반환타입 없음!
	// 만약 다른 생성자 (매개변수가 있는 생성자)만 존재한다면 기본 생성자는 자동으로 생성되지 않음.
	// 1. 인스턴스를 생성할 때 특정 작업을 수행하고 싶을 때
	// 2. *인스턴스를 생성과 동시에 인스턴스 변수를 초기화하고 싶을 때 
	// 의존성을 내부에서 주입하는 행위 - 지양한다.
	Human1() {
		System.out.println("Human1의 인스턴스가 생성되었습니다!");
		
		name = "홍길동";
		age = 20;
		gender = "남";
		address = "부산";
	}
	
	// 생성자 정의 (오버로딩)
	// 부분적으로 매개변수를 받을 때 - 지양한다.
	Human1 (String name1) {
		name = name1;
		age = 30;
		gender = "남";
		address = "부산";
	}
	
	// 생성자 정의 (오버로딩) 
	// 생성할 때 매개변수로 인스턴스의 값을 받아서 생성함.
	// 의존성을 외부에서 주입하는 행위
	Human1 (String name, int age, String gender) {
		// this : 현재 자기 자신의 인스턴스를 지칭하는 키워드 
		// 그 외 this 관련은 강사님 노션 참고해서 정리하기!!
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		
		this.address = "부산";
	}
	
	// 생성자를 이용한 인스턴스 복사 
	Human1(Human1 human1) {
		name = human1.name;
		age = human1.age;
		gender = human1.gender;
		address = human1.address;
	}
	
	// name에 의존하고 있는 형태 
	void great() {
		System.out.println(name.concat("이 인사를 합니다."));
	}
}

public class Constructor {

	public static void main(String[] args) {
		
		// Human1 클래스의 인스턴스 생성
		Human1 human1 = new Human1();
//		System.out.println(human1.name);
		// human1.great(); 의존하고 있는 인스턴스의 값이 없을 때 - error
		
		Human1 human2 = new Human1();
		System.out.println(human2.name); // 인스턴스 두 개 다 동일함.
		
		Human1 human3 = new Human1("이영희", 30, "여");
		System.out.println(human3.name);
		
		Human1 human4 = new Human1();
		
		// 얕은 복사 : 변수에 기억된 주소를 복사하는 행위
		Human1 human5 = human3;
		// 깊은 복사 : 인스턴스의 각 속성을 직접 복사하는 행위
		Human1 human6 = new Human1(human3); 
//		human6.name = human3.name;
//		human6.age = human3.age;
//		human6.gender = human3.gender;
		
		human3.name = "이성계";
		
		
		System.out.println(human3.name); // 이성계
		System.out.println(human5.name); // 이성계
		System.out.println(human6.name); // 이영희

	}

}











