package inheritance;

public class Quiz4 {

	public static void main(String[] args) {
		
		Monster monster = new Monster();
		monster.attack = 10;
		monster.health = 100;
		monster.showInfo();
		monster.doAttack();
		System.out.println();
		
		Slime slime = new Slime();
		slime.attack = 30;
		slime.health = 200;
		slime.skill = "마비";
		slime.showInfo();
		slime.doAttack();
		slime.doSkill();
	}

}

class Monster {
	int attack;
	int health;
	
	public void doAttack() {
		System.out.println("몬스터가 " + attack+ "만큼 공격했다!");
	}
	
	public void showInfo() {
		System.out.println("몬스터의 공격력은 " + attack + "이고 체력은 " + health + "이다.");
	}
}

class Slime extends Monster {
	String skill;
	
	public void doSkill() {
		System.out.println("슬라임이 " + skill + "을 시전했다!");
		
	}
}