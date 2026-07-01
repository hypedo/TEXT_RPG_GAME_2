# Java Text RPG Game 2

## 프로젝트 소개

Java를 사용하여 제작한 콘솔 기반 텍스트 RPG 게임입니다.

사용자는 영웅의 이름을 입력하고 직업을 선택한 뒤, 사냥터에서 몬스터와 전투하거나 포션 상점과 무기 상점을 이용하여 캐릭터를 강화할 수 있습니다.

기존 단일 파일 방식의 RPG 게임에서 발전하여, 이번 프로젝트에서는 캐릭터, 몬스터, 상점, 미션 기능을 각각 클래스로 분리하여 객체지향적인 구조로 구현하였습니다.

---

## 개발 환경

- Language: Java
- 실행 방식: 콘솔 입력 기반
- 주요 개념
  - 클래스
  - 상속
  - 메서드 오버라이딩
  - 객체 생성
  - 조건문
  - 반복문
  - Scanner 입력 처리

---

## 프로젝트 구조

```text
GAME
└── src
    ├── Main
    │   └── Run.java
    ├── Character
    │   ├── Character.java
    │   ├── Hero.java
    │   ├── Warrior.java
    │   ├── Wizard.java
    │   ├── Archer.java
    │   ├── Monster.java
    │   ├── Racoon.java
    │   ├── WildCat.java
    │   ├── WildDog.java
    │   └── WildBoar.java
    ├── Map
    │   ├── PotionStore.java
    │   ├── WeaponStore.java
    │   └── Mission.java
    └── module-info.java
