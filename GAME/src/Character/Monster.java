package Character;

public class Monster extends Character {
	public int power;
	public int defense;
	public int gold;
	public int exp;

	public Monster(String name, int level, int hp, int mp, int power, int defense, int gold, int exp) {
		super(name, level, hp, mp);
		this.power = power;
		this.defense = defense;
		this.gold = gold;
		this.exp = exp;
	}

	public int attack() {
		System.out.println(name + "의 공격!!");
		return power;
	}

	public void attacked(int sum) {
		int damage;

		if (sum <= this.defense + this.hp) {
			damage = 0;
		} else {
			damage = sum - this.defense;
		}

		this.hp = this.hp + this.defense - damage;
	}

}
