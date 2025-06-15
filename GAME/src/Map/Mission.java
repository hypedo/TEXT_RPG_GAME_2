package Map;

import Character.Hero;

public class Mission {
	String mission;
	public int count;
	public int reward;
	public int goal;

	Mission(String mission, int goal, int reward) {
		this.mission = mission;
		this.goal = goal;
		this.reward = reward;
	}

	public static Mission generate(int heroLevel) {
		// 예시: 레벨별로 다른 목표와 보상
		if (heroLevel == 2) {
			return new Mission("너구리 3마리 처치", 3, 50);
		} else if (heroLevel == 3) {
			return new Mission("살쾡이 2마리 처치", 2, 80);
		} else { // 레벨 4 이상
			return new Mission("멧돼지 5마리 처치", 5, 100);
		}
	}

	public static void showMission(int heroLevel) {
		if (heroLevel == 2) {
			System.out.println("레벨 2 미션: 너구리 3마리 처치");
		} else if (heroLevel == 3) {
			System.out.println("레벨 3 미션: 살쾡이 2마리 처치");
		} else {
			System.out.println("레벨 4 미션: 멧돼지 5마리 처치");
		}

	}

	public int count() {
		return ++count;
	}

	public void complete(Hero hero) {
		if (count >= goal) {
			System.out.println("미션 완료!");
			System.out.println("보상 지급!");
			hero.gold += reward;
			System.out.println("미션 보상으로" + reward + "원 획득!");
		} else {
			System.out.println("미션 실패..\n다음 기회에~");
		}
	}

}
