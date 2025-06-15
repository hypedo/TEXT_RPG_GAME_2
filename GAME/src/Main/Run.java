package Main;

import java.util.Random;
import java.util.Scanner;

import Character.Archer;
import Character.Hero;
import Character.Monster;
import Character.Racoon;
import Character.Warrior;
import Character.WildBoar;
import Character.WildCat;
import Character.WildDog;
import Character.Wizard;
import Map.Mission;
import Map.PotionStore;
import Map.WeaponStore;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.print("영웅의 이름을 입력하세요. : ");
		String name = in.next();
		Hero hero = new Hero(name, 1, 80, 80, 100, 100);
		Mission mission = null;
		System.out.println("이름이 입력되었습니다.");
		System.out.println("게임에 입장하였습니다.");
		System.out.println("_________________");
		System.out.println("1. 전사");
		System.out.println("2. 마법사");
		System.out.println("3. 궁수");
		System.out.println("직업의 번호를 입력하세요: ");
		int num = in.nextInt();
		if (num == 1) {
			System.out.println("전사 선택!");
			hero = new Warrior(name); // 자동 행변환
		}
		if (num == 2) {
			System.out.println("마법사 선택!");
			hero = new Wizard(name); // 자동 행변환
		}
		if (num == 3) {
			System.out.println("궁수 선택!");
			hero = new Archer(name); // 자동 행변환
		}

		PotionStore PotionStore = new PotionStore();
		WeaponStore WeaponStore = new WeaponStore();
		main: while (true) {
			if (hero.exp >= hero.level * 80) {
				int prevgold = hero.gold;
				hero.level += 1;
				System.out.println(hero.name + "의 레벨이" + hero.level + "이 되었습니다.");
				hero.gold += hero.level * 50;
				hero.exp = 0;
				System.out.println("레벨업 기념으로 돈이" + prevgold + "에서" + hero.gold + "이 되었습니다.");
				System.out.println("레벨업 보상 미션! ");
				mission = Mission.generate(hero.level);
				mission.showMission(hero.level);

			}
			System.out.println("현재 hero의 이름:" + hero.name);
			System.out.println("현재 " + hero.name + "의 레벨:" + hero.level);
			System.out.println("현재 " + hero.name + "의 힘:" + hero.power);
			System.out.println("현재 " + hero.name + "의 방어력:" + hero.defense);
			System.out.println("현재 " + hero.name + "의 HP:" + hero.hp);
			System.out.println("현재 " + hero.name + "의 MP:" + hero.mp);
			System.out.println("현재 " + hero.name + "의 경험치:" + hero.exp);
			System.out.println("현재 " + hero.name + "의 돈" + hero.gold + "원");
			System.out.println("_________________");
			System.out.println("1. 사냥터 \n2. 포션 상점 \n3. 무기 상점");
			System.out.println("입장할 장소를 선택하세요.\n0 누르면 게임 종료!");
			int x = in.nextInt();
			if (x == 0) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			if (x == 1) {
				System.out.println("사냥터에 입장하였습니다.");
				System.out.println("전투할 상대를 고르세요. \n0.랜덤 1.너구리 2.살쾡이 3.들개 4.멧돼지");
				int m = in.nextInt();

				Monster monster = null;

				if (m == 0) {
					Random random = new Random();
					m = random.nextInt(4) + 1;
				}
				if (m == 1) {

					monster = new Racoon();
				} else if (m == 2) {

					monster = new WildCat();
				} else if (m == 3) {

					monster = new WildDog();
				} else if (m == 4) {

					monster = new WildBoar();
				} else {
					System.out.println("잘못된 번호입니다!");
					continue main;
				}

				while (hero.hp > 0 && monster.hp > 0) {
					monster.attacked(hero.attack(monster));

					if (monster.hp < 0) {
						System.out.println(monster.name + "처치 완료!");
						hero.exp += monster.exp;
						hero.gold += monster.gold;
						if (mission != null) {
							int progress = mission.count();
							System.out.printf("미션 진행도: %d / %d%n", progress, mission.goal);
							if (progress >= mission.goal) {
								mission.complete(hero);
								mission = null;
							}
						}
						break;
					}

					hero.attacked(monster.attack());
					break;

				}
			}
			if (x == 2) {
				PotionStore p = new PotionStore();
				p.showMenu();
				System.out.println("구매할 포션 번호 입력:");
				int choice1 = in.nextInt();
				p.buyPotion(hero, choice1);

			}
			if (x == 3) {
				WeaponStore wp = new WeaponStore();
				wp.showMenu();
				System.out.println("구매할 무기 번호 입력: ");
				int choice2 = in.nextInt();
				wp.buyWeapon(hero, choice2);
			}
		}

	}
}
