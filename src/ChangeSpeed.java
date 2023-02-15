public class ChangeSpeed {

    static int newPlayerPosition = 0;
    public static void swampChangeSpeed(int swampPosition, int playerPosition) {

        if (playerPosition + Player.playerInitialSpeed >= swampPosition && playerPosition < swampPosition) {
            System.out.println("Вступили в болото. Теряете скорость");
            newPlayerPosition = swampPosition +
                    (int) ((playerPosition + Player.playerInitialSpeed - swampPosition) * 0.5) - playerPosition;

            System.out.println("Болото в точке - " + swampPosition +
                    " Ваша позиция - " + (newPlayerPosition + playerPosition));
        } else if (playerPosition > swampPosition) {
            newPlayerPosition = Player.playerInitialSpeed;
            System.out.println("Миновали болото. " +
                    "Ваша позиция - " + (newPlayerPosition + playerPosition));
        } else if (playerPosition < swampPosition - Player.playerInitialSpeed) {
            System.out.println("Болото еще далеко!");
        }
    }

    public void enemyChangeSpeed() {



    }

    public static int returnSpeed() {
        int swampSpeed = ChangeSpeed.newPlayerPosition;
        return swampSpeed;
    }

}
