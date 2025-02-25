package inheritance;

public class Quiz3 {

	public static void main(String[] args) {
		
		BalPen balPen = new BalPen();
		balPen.width = 2;
		balPen.amount = 100;
		balPen.color = "blue";
		
		FountainPen fountainPen = new FountainPen();
		fountainPen.width = 3;
		fountainPen.amount = 80;
		fountainPen.brand = "MONTBLANC";

	}

}

class Pen {
	int width;
	int amount;
}

class BalPen extends Pen {
	String color;
}
class FountainPen extends Pen {
	String brand;
}