package Character;

public class WildCat extends Monster {
	public WildCat() {
		super("살쾡이", 1, 150, 0, 30, 10, 20, 20);
	}

	public int attack() {
		System.out.println(name + "의 할퀴기");
		return power;
	}

}