package chapter3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Package2 {

	public static void main(String[] args) {
		
		// Collection Framework : Java 에서 데이터 구조에 대한 표준화된 기법을 제공
		
		// List : 데이터를 저장할 때 중복을 허용하고 순서가 존재하는 데이터 구조
		// Collection Framework 에서 데이터 타입을 지정할 땐 제너릭을 사용하여 지정
		// , 참조형 데이터 타입만 지정 가능
		List<Integer> list;
		
		// ArrayList 구현 클래스 : 인덱스를 이용한 검색이 빠름
		list = new ArrayList<>();
		// LinkedList 구현 클래스 : 추가, 삭제가 빠름
		list = new LinkedList<>();
		
		// add() : List 에 요소 추가
		// 추가할 요소는 제너릭으로 지정한 데이터 타입의 요소이어야 함
		list.add(99);
		// list.add("99");
		System.out.println(list); // [99]
		
		list.add(100);
		System.out.println(list); // [99, 100]
		
		// get() : List 의 특정 인덱스 값을 가져옴
		// List 의 인덱스 범위를 초과하지 않도록 주의
		// 기본형 데이터 타입 변수로 반환값을 받을 땐 null 이 올 수 있음을 주의
		int number = list.get(0);
		System.out.println(number);
		
		// set() : List 의 특정 인덱스 요소를 변경
		// List 인덱스 범위를 벗어나는 인덱스를 지정할 수 없음
		list.set(1, -100);
		System.out.println(list); // [99, -100]
		
		// remove() : List 의 특정 인덱스 요소를 제거
		list.remove(0);
		System.out.println(list);
		
		List<String> stringList = new ArrayList<>();
		stringList.add("apple");
		stringList.add("banana");
		stringList.add("apple");
		System.out.println(stringList);
		
		stringList.remove("apple");
		System.out.println(stringList);
		
		// size() : List 의 크기를 반환
		System.out.println(list.size());
		
		// Set : 데이터를 저장할 때 중복을 허용하지 않고 순서가 존재하지 않는 데이터 구조 (집합)
		//       순서가 존재하지 않기 때문에 특정 인덱스 요소를 호출할 수 없음. (대신 존재유무 확인)
		Set<String> set;
		
		// HashSet 구현 클래스 : 검색이 빠름
		set = new HashSet<>();
		// TreeSet 구현 클래스 : 요소를 정렬해서 추가
		set = new TreeSet<>();
		
		// add() : Set 에 요소를 추가함. 만약 동일한 요소가 존재한다면 추가하지 않음.
		set.add("apple");
		System.out.println(set);
		set.add("banana");
		System.out.println(set);
		set.add("apple");
		System.out.println(set); // 동일한 요소가 존재하므로 추가되지 않음
		
		// contains() : Set 에 특정 요소가 존재하는지 확인 (boolean 타입으로 결과 반환)
		System.out.println(set.contains("apple"));
		
		// remove() : Set 에 특정 요소를 제거
		set.remove("apple");
		System.out.println(set);
		
		// Map : 키와 값 한 쌍으로 이루어진 요소들의 집합 (순서 없음)
		// 키는 중복이 불가능, 값은 중복이 가능
		Map<String, String> map;
		
		// HashMap 구현 클래스 : 검색 속도가 빠름
		map = new HashMap<>();
		// TreeMap 구현 클래스 : 키를 정렬하여 저장
		map = new TreeMap<>();
		
		// put() : Map 에 특정한 키와 값의 쌍을 추가
		// 만약 동일한 키가 존재하면 원래 값을 덮어씌움
		// 대소문자에 따라서 순서가 달라짐.
		map.put("Apple", "사과");
		System.out.println(map); // {Apple=사과}
		map.put("Banana", "바나나");
		System.out.println(map); // {Apple=사과, Banana=바나나}
		map.put("Banana", "버네이너");
		System.out.println(map); // {Apple=사과, Banana=버네이너}
		
		// get() : Map 에서 특정 키를 가지는 요소를 반환
		//         존재하지 않는 키를 검색하면 null 을 반환
		System.out.println(map.get("Apple"));
		
		// containsKey() : Map 에 특정 키가 존재하는지 확인 (boolean 타입으로 결과 반환)
		System.out.println(map.containsKey("Apple"));
		
		// remove() : Map 에서 특정 키를 가지는 키와 값의 쌍을 제거
		//            삭제 작업을 성공하면 해당 키의 값을 반환
		System.out.println(map.remove("Apple"));
		System.out.println(map);
		
		class Human {
			String name;
			String address;
			int age;
		}
		
		Human human1 = new Human();
		human1.name = "홍길동";
		human1.address = "부산광역시";
		human1.age = 20;
		
		Map<String, Object> human2 = new HashMap<>();
		human2.put("naem", "홍길동");
		human2.put("address", "부산광역시");
		human2.put("age", 20);
		
		// 1. 문제점 : 사용 혹은 추가 작업에 실수 가능성 <ex) 오타>
		human2.get("name");
		// 2. 문제점 : 타입의 안정성의 문제
		int age = (int) human2.get("age");
		// 3. 문제점 : 데이터 무결성의 문제

	}

}









