package polymorphism;

public class Ex1 {

	public static void main(String[] args) {
		// 부모타입으로 형변환
		Animal human = new Human();
		human.move();
		Animal tiger = new Tiger();
		tiger.move();
		Animal eagle = new Eagle();
		eagle.move();
		
		// 하나의 클래스로 여러 객체를 사용하는 것: 다형성
		// Animal -> Human Tiger Eagle
	}

}

// 동물
class Animal {
	public void move() {
		System.out.println("동물이 움직입니다");
	}
}

// 사람
class Human extends Animal {
	// 부모가 물려준 함수가 자식과 맞지 않을때는, 함수 재정의
	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다");
	}

}

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다");
	}
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다");
	}	
}