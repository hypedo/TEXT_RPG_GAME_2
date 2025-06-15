package Character;

import java.util.Scanner;

public class Archer extends Hero {
	public Archer(String name) {
		super(name, 1, 60, 60, 40, 30);
	}

	public int attack(Monster monster) {
		Scanner in = new Scanner(System.in);
		System.out.println("1. 불꽃 화살(레벨 1부터 가능)");
		System.out.println("2. 얼음 화살(레벨 3부터 가능, 멧돼지한테 강력)");
		System.out.println("3. 번개 화살(레벨 5부터 가능)");
		System.out.println("공격 번호를 입력하세요: ");
		int num = in.nextInt();
		int sum = 0;

		if (num == 1 && level >= 1) {
			sum += level * 10 + power * 80;

			mp -= 10;
		} else if (num == 2 && level >= 3) {
			sum += level * 10 + power * 90;

			mp -= 10;
			if (monster instanceof WildBoar) {
				System.out.println("멧돼지에게 얼음 화살은 특수 데미지!");
				sum *= 2;
			}
		} else if (num == 3 && level >= 5) {
			sum += level * 10 + power * 150;

		} else {
			System.out.println("스킬 발동 불가! -> 기본 공격");
			sum += level * 10;
		}
		return sum;
	}
}
