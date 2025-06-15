package Map;

import Character.Hero;

public class PotionStore {

	public void showMenu() {
		System.out.println("포션 상점");
		System.out.println("1. 힘 증강 포션 (30원)");
		System.out.println("2. 방어력 증강 포션 (30원)");
		System.out.println("3. 경험치 증강 포션 (100원)");
		System.out.println("4. HP 증강 포션 (10원)");
		System.out.println("5. MP 증강 포션 (10원)");

	}

	public void buyPotion(Hero hero, int choice1) {
		switch (choice1) {
		case 1:
			if (hero.gold >= 30) {
				System.out.println("힘 증강 포션 구매!");
				hero.gold -= 30;
				hero.power += 3;

			} else {
				System.out.println("구매 불가");
			}
			break;
		case 2:
			if (hero.gold >= 30) {
				System.out.println("방어력 증강 포션 구매!");
				hero.gold -= 30;
				hero.defense += 3;

			} else {
				System.out.println("구매 불가");
			}
			break;
		case 3:
			if (hero.gold >= 100) {
				System.out.println("경험치 증강 포션 구매!");
				hero.gold -= 100;
				hero.exp += 50;

			} else {
				System.out.println("구매 불가");
			}
			break;
		case 4:
			if (hero.gold >= 10) {
				System.out.println("HP 증강 포션 구매!");
				hero.gold -= 10;
				hero.hp += 50;

			} else {
				System.out.println("구매 불가");
			}
			break;
		case 5:
			if (hero.gold >= 10) {
				System.out.println("MP 증강 포션 구매!");
				hero.gold -= 10;
				hero.mp += 50;

			} else {
				System.out.println("구매 불가");
			}
			break;
		default:
			System.out.println("다시 입력하세요: ");
		}
	}
}
