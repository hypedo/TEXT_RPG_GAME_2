package Character;

public class Racoon extends Monster {
	public Racoon() {
		super("너구리", 1, 10, 0, 20, 5, 10, 50);
	}

	public int attack() {
		System.out.println(name + "의 침뱉기");
		return power;
	}

}