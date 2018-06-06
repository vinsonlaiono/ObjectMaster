
public class Human {
	int health = 100;
	int strength = 3;
	int stealth= 3;
	int intellegence = 3;
	
	public void displayLife() {
		System.out.println("Health: " + health);
		System.out.println("Strength: " + strength);
		System.out.println("Stealth: " + stealth);
		System.out.println("Intellegence: " + intellegence);
	}
	
	public void attack() {
		System.out.println("this is an attack");
	}
	
}
