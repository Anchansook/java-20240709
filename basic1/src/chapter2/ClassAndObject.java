package chapter2;

// 클래스 : 공통된 속성(필드)과 기능(메서드)을 정의해둔 것
// [접근제어자] class 클래스명 { 속성, 기능 }
class ExampleClass1 {
	// 속성 : 클래스가 가질 수 있는 정보나 상태
	//      일반적으로 변수로 표현
	
	// 인스턴스 변수 : 각 인스턴스마다 독립적으로 값을 가지는 변수
	// 반드시 인스턴스가 생성된 후에 사용할 수 있음.
	int attribute1;
	double attribute2;
	
	// 클래스 변수 : 해당 클래스로 생성된 '모든 인스턴스가 공유'하는 변수
	// 필드(속성)앞에 static 키워드를 사용하여 지정
	// 인스턴스 없이(즉 인스턴스 생성 없이도) 클래스로 직접 접근할 수 있음. ex) 클래스명.변수명
	static int staticAttribute;
	
	// 기능 : 클래스가 가질 수 있는 행동이나 작업 (메서드)
	// [접근제어자] 반환타입 메서드명 (매개변수타입 매개변수명[, ...])
	// {메서드 기능 구현}
	
	// 인스턴스 메서드 : 인스턴스를 생성한 후 사용할 수 있는 메서드
	// 인스턴스 필드를 사용하는 기능에 대해서 인스턴스 메서드를 사용
	int method1 (int arg1) {
		// 기능 구현
		// 반환타입이 void가 아니면 반드시 return으로 결과값을 반환해야 함.
		return arg1 * arg1;
	}
	
	// 클래스 메서드 : 인스턴스 생성 없이 클래스로만 호출 가능한 메서드
	// 반환타입 앞에 static 키워드를 붙여서 사용
	// 인스턴스 필드를 사용하지 않는 메서드에 주로 사용됨.
	// 인스턴스 필드를 사용할 수 없음.
	static void staticMethod () {
		// System.out.println(attribute1); - error
		// method1(5); - error
		// : 인스턴스 메서드 & 인스턴스 필드이기 때문에 static 메서드에 사용할 수 없음.
	}
}

// 스마트폰 

// = 속성 =
// - 제조사 String
// - 제조일자 String 
// - 모델명 String
// - 전화번호 String
// - 어플 리스트 String[]
// - 전원상태 boolean

// = 기능 =
// - 스마트폰 정보 보기 
// - 전화 걸기
// - 어플 설치
// - 문자 보내기
// - 전원 누르기

class SmartPhone {
	
	// 속성 정의
	String manufacturer;
	String manufactureDate;
	String modelName;
	String telNumber;
	String[] appList = new String[0]; // 어플 리스트 배열 0으로 초기화
	boolean powerStatus;
	
	// 기능 구현
	// 스마트폰 정보 보기
	void printInformation () {
		System.out.println("===== 정보 =====");
		System.out.println("제조사 : " + manufacturer);
		System.out.println("제조날짜 : " + manufactureDate);
		System.out.println("모델명 : " + modelName);
		System.out.println("전화번호 : " + telNumber);
	}
	
	// 전화 걸기
	void call (String toTelNumber) {
		System.out.println(telNumber + "가" + toTelNumber + "로 전화를 겁니다.");
	}
	
	// 어플 설치
	void appInstall (String appName) {
		// 원래 배열에 +1로 늘리기
		String[] newAppList = new String[appList.length + 1];
		
		// 앱리스트 길이만큼 돌면서 앱리스트 인덱스를 새로운 앱리스트 인덱스에 넣어줌.
		for (int index = 0; index < appList.length; index++) {
			newAppList[index] = appList[index];
		}
		
		// 인자로 받을 앱이름을 새리스트로 추가
		newAppList[newAppList.length - 1] = appName;
		// 새 앱리스트를 기존 앱리스트에 할당
		appList = newAppList;
	}
	
	// 문자 보내기
	void sendMessage (String toTelNumber, String message) {
		System.out.println(telNumber + "가 " + toTelNumber + "에게 " + message + " 를 전송했습니다.");
	}
	
	// 전원 누르기
	void pressPowerButton () {
		powerStatus = !powerStatus;
	}
	
}

// 한국인

// = 속성 =
// - 이름
// - 나이
// - 국적

class Korean {
	// 속성
	String name;
	int age;
	static String nationality = "대한민국"; // 동일한 속성
}

// 삼각 함수

// = 기능 =
// 빗변 구하기
// 둘레 구하기
// sin 구하기
// cos 구하기
// tan 구하기

class TriangleMath {
	
	// PI, getCircleArea(double)은 SRP(단일책임원칙) 원칙에 위배됨.
	static final double PI = 3.1415;
	
	// 원의 넓이 구하기
	static double getCircleArea (double radius) {
		if (radius <= 0) return 0;
		
		double area = radius * radius * PI; 
		// 인스턴스 변수일 때는 에러남. 인스턴스는 인스턴스 생성 후 사용 가능한데 static은 인스턴스 생성 없이도 사용가능하기 때문.
		return area;
	}
	
	// Math.pow(밑수(제곱할 수), 지수(제곱할 횟수))
	// : java.lang.math 클래스 안에 있는 거듭제곱 메서드
	// Math.sqrt()
	// : java.lang.math 클래스 안에 있는 제곱근(루트) 메서드
	
	// 외부에서 매개변수를 받아올 때는 검증 작업을 해야 함.
	
	// 기능 함수 앞에 static을 붙이면 인스턴스 생성 없이 class를 바로 호출해서 사용 가능함.
	
	// 빗변 구하기
	static double getHypotenuse(double bottom, double height) {
		// 0이하의 값이 들어오면 0을 반환 
		// 0초과의 값들만 계산하도록 검사하는 로직
		if (bottom <= 0 || height <= 0) return 0;
		
		double hypotenuse2 = Math.pow(bottom, 2) + Math.pow(height, 2);
		double hypotenuse = Math.sqrt(hypotenuse2);
		
		return hypotenuse;
	}
	
	// 둘레 구하기
	static double getCircumference (double bottom, double height, double hypotenuse) {
		// 검증 로직
		if (bottom <= 0 || height <= 0 || hypotenuse <= 0) return 0;
		
		double circumference = bottom + height + hypotenuse;
		return circumference;
	}
	
	// sin 구하기
	static double getSin (double hypotenuse, double height) {
		if (hypotenuse <= 0 || height <= 0) return 0;
		
		double sin = height / hypotenuse;
		return sin;
	}
 	
}

public class ClassAndObject {

	public static void main(String[] args) {
		
		// 인스턴스 : 특정 클래스로 정의된 것을 실체화한 객체
		// 클래스명 참조변수명(인스턴스를 담는 변수명) = new 클래스명(); : new 클래스명(); >> 이게 인스턴스
		ExampleClass1 instance1 = new ExampleClass1();
		ExampleClass1 instance2 = new ExampleClass1();
		
		// 인스턴스가 가지고 있는 속성(필드) 접근 방법
		// 인스턴스.속성명;
		instance1.attribute1 = 10;
		instance2.attribute1 = 20;
		
		System.out.println(instance1.attribute1);
		System.out.println(instance2.attribute1);
		
		// 인스턴스가 가지고 있는 메서드(기능) 호출 방법
		// 인스턴스.메서드명(매개변수...);
		int methodResult = instance1.method1(5);
		System.out.println(methodResult);
		
		instance1.staticAttribute = 10;
		System.out.println(instance1.staticAttribute);
		System.out.println(instance2.staticAttribute);
		
		instance2.staticAttribute = 33;
		System.out.println(instance1.staticAttribute);
		System.out.println(instance2.staticAttribute);
		System.out.println(ExampleClass1.staticAttribute);
		
		System.out.println("=======================================");
		
		SmartPhone iphone1 = new SmartPhone();
		SmartPhone galaxy1 = new SmartPhone();
		
		iphone1.manufacturer = "Apple";
		iphone1.manufactureDate = "2024-07-12";
		iphone1.modelName = "아이폰 15 프로";
		iphone1.telNumber = "010-1234-5678";
		iphone1.powerStatus = false;
		
		System.out.println(iphone1.manufacturer);
		System.out.println(galaxy1.manufacturer);
		System.out.println(galaxy1.powerStatus);
		
		iphone1.printInformation();
		galaxy1.printInformation();
		
		iphone1.sendMessage("010-1111-2222", "안녕하세요.");
		
		// 인스턴스 생성
		Korean korean1 = new Korean();
		Korean korean2 = new Korean();
		
		// korean1 속성 정의
		korean1.name = "홍길동";
		korean1.age = 20;
		
		// korean2 속성 정의
		korean2.name = "이영희";
		korean2.age = 30;
		
		System.out.println(korean1.nationality);
		System.out.println(korean2.nationality);
		
		korean1.nationality = "한국";
		System.out.println(korean1.nationality);
		System.out.println(korean2.nationality);
		
		// 인스턴스 생성
//		TriangleMath triangleMath = new TriangleMath();
		
		double bottom = 3;
		double height = 4;
		double hypotenuse = TriangleMath.getHypotenuse(bottom, height);
		
		System.out.println(hypotenuse);
		
	}

}









