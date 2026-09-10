import java.util.InputMismatchException;

public class functional {
    public static void main(String[] args) {
        double playerHp = 100;
        int bossHp = 200;
        int playerDamage = 20;
        double bossDamage = 10.0;
        double playerArmor = 0.05;
        boolean isPlayerAlive = true;
        boolean isBossAlive = true;
        int playerAttacks = 1;
        boolean isPlayersSwordPoisoned = false;
        String playerState = "Idle";

        try {
            playerAttacks = args.length > 0 ? Integer.parseInt(args[0]): 1;
            isPlayersSwordPoisoned = args.length > 1 && Boolean.parseBoolean(args[1]);
            playerState = args.length > 2 ? args[2]: "Idle";
        } catch (NumberFormatException e) {
            System.out.println("ожидаемые типы данных: целочисленный, логический, строка");
            System.exit(0);
        }


        int score = 100;
        int iteration = 0;


        while (isPlayerAlive && isBossAlive) {
            switch (playerState) {
                case "Idle":
                    break;
                case "Attack":
                    playerAttacks = playerAttacks>0 ? playerAttacks: 1;
                    for (int n = 0; n < playerAttacks; n ++) {
                        bossHp -= playerDamage;
                    }
                    break;
                case "Defense":
                    playerArmor = 0.75;
                    break;
            }
            if (isPlayersSwordPoisoned) {
                bossHp -= 5;
            }
            playerHp -= bossDamage * (1 - playerArmor);
            score -= 1;
            isPlayerAlive = playerHp > 0;
            isBossAlive = bossHp > 0;
            if (!isBossAlive) {
                score += 50;
            }
            iteration += 1;
        }
        System.out.println("Your score:" + score);
        System.out.println("Player alive: " + isPlayerAlive);
        System.out.println("Boss alive: " + isBossAlive);
        System.out.println("Iterations count: " + iteration);

    }
}
