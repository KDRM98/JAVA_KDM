package Day10.Ex02_Comparable;

/*
	compareTo() 메소드의 반환값
	- 0		: 해당객체와 비교객체가 같은 순서
	- 음수	: 해당객체가 비교객체보다 작은 값
	- 양수	: 해당객체가 비교객체보다 큰 값
	
	나이(오름차순)
	if(this.age == o.age) return 0;
	else if(this.age < o.age) return -1; <-- return값이 음수라는건 this.age가 더 작다면 작은 것들을 앞으로 배치
	else return 1;

	나이(내림차순)
	if(this.age == o.age) return 0;
	else if(this.age > o.age) return -1; <-- return값이 음수라는건 this.age가 더 크다면 큰 것들을 앞으로 배치
	else return 1;
 */

public class Person implements Comparable<Person>{

	String name;		// 이름
	int age;			// 나이
	
	//생성자
	
	public Person() {
	
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		// 나이순으로 오름차순
		// 해당객체(this) 비교객체(o)
		// 18 - 44 		: 음수 		--> 18을 더 앞에 정렬(오름차순)
		
		// 비교객체 - 해당객체(this)
		// 44 - 18		: 양수 		--> 18을 더 뒤에 정렬(내림차순)
		
		int gap = this.getAge() - o.getAge();	// 오름차순
		return gap;
	}
	   
	
}
