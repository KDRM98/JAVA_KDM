package DAY04.Class;

public class Pikachu {

	public int energy;
	public String type;
	
	// 생성자
	public Pikachu() {
		this ( 100, "전기"); //this()생성자는 무조건 첫번째 줄에 생성해야한다.
//		energy = 100;
//		type = "전기";
	}
	
	// 생성자 자동완성
	// alt + shift + S -> O
	public Pikachu(int energy, String type) {
		this.energy = energy;
		this.type = type;
	}
	
	// 메소드
	// 접근지정자 반환타입 메소드명 (매개변수){ }
	public String aAttack() {
		return "십만볼트";
	}

	public String bAttack() {
		return "전광석화";
	}

	@Override
	public String toString() {
		return "Pikachu [energy=" + energy + ", type=" + type + "]";
	}
	
	
	
}
