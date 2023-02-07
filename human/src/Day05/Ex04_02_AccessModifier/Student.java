package Day05.Ex04_02_AccessModifier;

import Day05.Ex04_01_AccessModifier.Person;

public class Student extends Person{

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int height, int age, int weight) {
		super(name, height, age, weight);
		// TODO Auto-generated constructor stub
	}

	public void defaultSetting() {
		name = "이름없음";
		height = 175;
		//age = 20;		default : 같은 패키지 내에서만 접근 가능
		//weight = 60;	private : 해당 클래스 내에서만 접근 가능
		setAge(20);
		setWeight(60);
	}
	
}
