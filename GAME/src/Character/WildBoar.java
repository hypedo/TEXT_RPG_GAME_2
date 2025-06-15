package Character;

public class WildBoar extends Monster {
	public WildBoar() {
		super("멧돼지", 1, 250, 0, 50, 30, 40, 40);
	}

	public int attack() {
		System.out.println(name + "의 몸통박치기");
		return power;
	}
}