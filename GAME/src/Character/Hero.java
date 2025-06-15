package Character;

public class Hero extends Character {
	public int power;
	public int defense;
	public int gold = 0;
	public int exp = 0;

	public Hero(String name, int level, int hp, int mp, int power, int defense) {
		super(name, level, hp, mp);
		this.power = power;
		this.defense = defense;

	}

	public int attack(Monster monster) {
		System.out.println(name + "의 공격!!");
		return level * 10 + power * 30;

	}

	public void attacked(int sum) {
		int damage;
		if (sum <= this.defense) {
			damage = 0;
		} else {
			damage = sum - this.defense;
		}
		this.hp -= damage;
		System.out.println(name + "가 받는 데미지는" + damage);

		if (this.hp <= 0) {
			System.out.println(name + " 죽음!");
			System.out.println(name + " 부활~");
			this.hp = 80;
		}

	}
}
