package polymorphism;

public class Quiz1 {

	public static void main(String[] args) {
		runCar(new Bus()); // Car car = new Bus()
		runCar(new SportsCar()); // Car car = new SportsCar()

	}
	
	// 매개변수 부모타입으로 선언
	public static void runCar(Car car) {
		car.run(); // 실제 인스턴스의 함수가 호출됨
	}
	// 하나의 클래스로 여러 객체를 사용할 수 있다 -> 다형성

//	public static void runCar(Bus bus) {
//		bus.run();
//	}
//	public static void runCar(SportsCar sportsCar) {
//		sportsCar.run();
//	}
}
class Car {
	public void run() {
		System.out.println("자동차가 달린다");
	}
}
class Bus extends Car {

	@Override
	public void run() {
		System.out.println("버스가 달린다");
	}	
}
class SportsCar extends Car {

	@Override
	public void run() {
		System.out.println("스포츠카가 달린다");
	}
	
}