package Character;

import java.util.Scanner;

public class Wizard extends Hero {
	public Wizard(String name) {
		super(name, 1, 60, 60, 30, 20);
	}

	public int attack(Monster monster) {
		Scanner in = new Scanner(System.in);
		System.out.println("1. 파이어 볼(레벨 1부터 가능)");
		System.out.println("2. 아이스 볼(레벨 3부터 가능, 들개한테 강력)");
		System.out.println("3. 번개 볼(레벨 5부터 가능)");
		System.out.println("공격 번호를 입력하세요: ");
		int num = in.nextInt();
		int sum = 0;

		if (num == 1 && level >= 1) {
			sum += level * 10 + power * 70;

			mp -= 10;
		} else if (num == 2 && level >= 3) {
			sum += level * 10 + power * 100;

			mp -= 10;
			if (monster instanceof WildDog) {
				System.out.println("들게에게 아이스 볼은 특수 데미지!");
				sum *= 2;
			}
		} else if (num == 3 && level >= 5) {
			sum += level * 10 + power * 150;
			mp -= 50;
		} else {

			System.out.println("스킬 발동 불가! -> 기본 공격");
			sum += level * 10;
		}
		return sum;
	}
}