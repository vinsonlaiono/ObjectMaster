
public class Samurai extends Human{
	private static int counter;
	
	public Samurai() {
		counter++;
	}
	
	public Samurai deathBlow(Human enemy) {
		// this method kills the other human
		enemy.health = enemy.health - enemy.health;
		System.out.println("Avada Karaverda...");
		return this;
	}
	
	public void meditate() {
		//heals the Samurai for half of their current health
		health += health/2;
		System.out.println(health);
		
		
	}
	public int howMany() {
		// returns the total current number of Samurai.
		System.out.println(counter);
		return counter;
	}
}
