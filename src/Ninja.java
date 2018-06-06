
public class Ninja extends Human {
	private int stealth = 10;
	
	
	
	public Ninja steal(Human enemy) {
		enemy.health -= stealth;
		health += stealth;
		System.out.println("I use my stealth attack on you!");
		System.out.println(this + " health: " + health);
		return this;
	}
	
	public void runAway() {
		health -= 10;
		System.out.println("Im out of here.. seeya!");
	}

}
