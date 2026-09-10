public class Operators {
    public static void main(String[] args) {
        var damage = 10;
        int playerHp = 45;
        float speed = 10.0f;
        long bossHp = playerHp * 10;
        int bugSpeed = (int) speed;
        damage = (playerHp * bugSpeed * 3) / 2;
        bossHp ++;
        bossHp += speed;

        byte binaryAnd = 10 & 110;

        boolean bossIsDead = damage > bossHp;
        boolean playerIsDead = damage > playerHp;
        boolean gameOver = bossIsDead || playerIsDead;
        boolean stringIsString = "String" instanceof String;

        boolean ternaryOperator = 100 > 101 ? true: false;

        int bitwise = damage >> 1;
        int bitwise2 = damage >>> 1;

    }
}