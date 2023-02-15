import java.util.Objects;
import java.util.Scanner;

public class Player {

    // начальная скорость 5 м/с
    public static int playerInitialSpeed = 5;
    // начальная позиция 5 м
    public static int playerPosition = 5;

    public static int playerHealth = 100;

    public static int getPlayerPosition() {
        return playerPosition;
    }

    public static void setPlayerPosition(int playerPosition) {
        Player.playerPosition += playerPosition;
    }

    public void playerMove() {
            System.out.println("Для продолжения движения введите букву w");
            Scanner console = new Scanner(System.in);
            if (Objects.equals(console.nextLine(), "w")) {
                this.playerPosition += ChangeSpeed.returnSpeed();
            } else {
                this.playerPosition = this.playerPosition;
            }
    }

    public void playerDeath() {
            System.out.println("Вы умерли!");
    }
}
