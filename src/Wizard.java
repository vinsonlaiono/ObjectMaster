
public class Wizard extends Human {
	private int health = 50;
	private int intelligence = 8;
	
	public void displayHealth() {
		System.out.println("Health: " + health);
	}
	
	// Wizards healing power
	public Wizard heal(Human enemy) {
		enemy.health += intelligence;
		System.out.println("Consider yourself lucky for healing you..." + this);
		System.out.println(enemy);
		return this;
	}
	// Wizards fire ball attack
	public Wizard fireball(Human enemy) {
		enemy.health -= 3;
		System.out.println("This is only a warning!");
		System.out.println(enemy + "s Health: " + enemy.health);
		return this;
	}
	
	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
}
