
public class HumanTest {
	public static void main(String[] args) {
		// these two are team mates
		Human james = new Human();
		Wizard gandolf = new Wizard();
		// jetli is teammates with the triplets
		Ninja jetli = new Ninja();
		Samurai tom = new Samurai();
		Samurai tim = new Samurai();
		Samurai tam = new Samurai();
		
		// There is a battle between the James and Gandolf vs Jetli and the triplelets
		
		
		// jetli uses steal attack on james
		jetli.steal(james);
		
		// oh no james is hurt
		// quick gandolf you need to help james with your heal spell
		gandolf.heal(james);
		
		// Greate now gandolf uses fire ball attack as payback to jetli
		gandolf.fireball(jetli);
		
		jetli.steal(gandolf);
		// how many samurais are there?
		tim.howMany();
	}
}
