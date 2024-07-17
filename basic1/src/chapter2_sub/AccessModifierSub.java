package chapter2_sub;

// chapter2 package 에 선언된 AccessModifier 클래스는 
// 접근 제어자가 public 이기 때문에 외부 패키지에서 import 가 가능
import chapter2.AccessModifier;

// chapter2 package 에 선언된 AccessModifierRun 클래스는
// 접근 제어자가 default(pakage)이기 때문에 외부 패키지에서 import 가 불가능
// import chapter2.AccessModifierRun;

public class AccessModifierSub {
	
	void method() {
		
		// 인스턴스 생성
		AccessModifier instance = new AccessModifier();
		
		// AccessModifier의 publicVariable 필드(속성)는
		// 접근제어자가 public 이기 때문에 외부 패키지에서 접근이 가능
		instance.publicVariable = 0;
		
		// AccessModifier의 protectedVariable, defaultVariable, privateVariable필드는
		// 접근제어자가 각각 protected, default, private 이기 때문에 외부 패키지에서 접근이 불가능
		// instance.protectedVariable = 0;
		// instance.defaultVariable = 0;
		// instance.privateVariable = 0;
		
	}

}

class SubClass extends AccessModifier {
	
	void method() {
		
		AccessModifier instance = new AccessModifier();
		
		// instance.publicVariable = 0;
		// instance.protectedVariable = 0;
		// instance.defaultVariable = 0;
		// instance.privateVariable = 0;
		
		// AccessModifier의 publicVariable, protectedVariable 필드는
		// 접근제어자가 각각 public, protected 이기 때문에 자손 클래스에서 접근이 가능
		super.publicVariable = 0;
		super.protectedVariable = 0;
		
		// AccessModifier의 defaultVariable, privateVariable 필드는
		// 접근제어자가 각각 default, private 이기 때문에 자손 클래스에서 접근이 불가능
		// super.defaultVariable = 0;
		// super.privateVariable = 0;
		
	}
	
}








