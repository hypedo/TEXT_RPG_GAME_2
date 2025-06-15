package Character;

public class WildDog extends Monster {
	public WildDog() {
		super("들개", 1, 200, 0, 40, 20, 30, 30);
	}

	public int attack() {
		System.out.println(name + "의 물어뜯기");
		return power;
	}
}