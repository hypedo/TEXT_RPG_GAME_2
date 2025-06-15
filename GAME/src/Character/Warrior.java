package Character;

import java.util.Scanner;

public class Warrior extends Hero {
	public Warrior(String name) {
		super(name, 1, 80, 0, 15, 25);
	}

	public int attack(Monster monster) {

		Scanner in = new Scanner(System.in);
		System.out.println("1. 째려보기(레벨 1부터 가능)");
		System.out.println("2. 싸커킥(레벨 3부터 가능, 살쾡이에게 강력)");
		System.out.println("3. 날라차기(레벨 5부터 가능)");
		System.out.println("공격 번호를 입력하세요: ");

		int num = in.nextInt();
		int sum = 0;

		if (num == 1 && (level >= 1)) {

			sum += level * 10 + power * 50;
		} else if (num == 2 && (level >= 3)) {
			sum += level * 10 + power * 70;
			if (monster instanceof WildCat) {
				System.out.println("살쾡이에게 싸커킥은 특수 데미지");
				sum *= 2;
			}
		} else if (num == 3 && (level >= 5)) {
			sum += level * 10 + power * 80;
		} else {
			System.out.println("스킬 발동 불가! -> 기본 공격");
			sum += power;
		}
		return sum;
	}

}