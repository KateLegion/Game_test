public class Enemy {

    // начальная скорость 4 м/с
    public int enemyInitialSpeed = 4;

    public int damage = 25;

    public static int enemyPosition = - (int) (Math.random() * 3) + Player.playerPosition;

//    public Enemy(int enemyPosition) {
//        this.enemyPosition = enemyPosition;
//    }
}
