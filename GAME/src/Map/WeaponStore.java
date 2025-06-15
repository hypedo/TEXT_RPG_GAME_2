package Map;

import Character.Archer;
import Character.Hero;
import Character.Warrior;
import Character.Wizard;

public class WeaponStore {

	public void showMenu() {
		System.out.println("무기 상점");
		System.out.println("1. 대검");
		System.out.println("2. 간달프 지팡이");
		System.out.println("3. 버드나무로 만든 활");
		System.out.println("| 직업     | 무기 이름       |   가격   | 무기 효과  |\r\n"
				+ "|--------|---------------|---------|----------|\r\n"
				+ "| 전사    | 대검            |   100  |    +100   |\r\n"
				+ "| 마법사   | 간달프 지팡이     |   100  |    +100   |\r\n" + "| 궁수    | 버드나무로 만든 활 |   100   |    +100   |");
	}

	public void buyWeapon(Hero hero, int choice2) {
		switch (choice2) {
		case 1:
			if (hero.gold >= 100 && (hero instanceof Warrior)) {
				System.out.println("대검 구매!");
				hero.gold -= 100;
				hero.power += 100;
			} else {
				System.out.println("검 종류는 전사 직업만 구매할 수 있습니다.");
			}
			break;
		case 2:
			if (hero.gold >= 100 && (hero instanceof Wizard)) {
				System.out.println("간달프 지팡이 구매!");
				hero.gold -= 100;
				hero.power += 100;
			} else {
				System.out.println("지팡이 종류는 마법사 직업만 구매할 수 있습니다.");
			}
			break;
		case 3:
			if (hero.gold >= 100 && (hero instanceof Archer)) {
				System.out.println("버드나무로 만든 활 구매!");
				hero.gold -= 100;
				hero.power += 100;
			} else {
				System.out.println("활 종류는 궁수 직업만 구매할 수 있습니다.");
			}
			break;
		default:
			System.out.println("다시 입력하세요: ");
		}
	}
}
