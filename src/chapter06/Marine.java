package chapter06;

public class Marine {

    // 위치 좌표
    int x = 0, y = 0;

    // 현재 체력
    int hp = 60;

    // 공격력
    static int weapon = 6;

    // 방어력
    static int armor = 0;

    static void weaponUp() {
        weapon++;
    }

    static void armorUp() {
        armor++;
    }

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
