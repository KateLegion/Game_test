import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Field {

    public static void main(String[] args) {
        Player player = new Player();
        List<Swamp> swampList = new ArrayList<Swamp>();

        //while (player.playerHealth > 0) {

        if (player.playerHealth > 0) {
            for (int i = 0; i < 10; i++) {
                swampList.add(new Swamp());;

                player.playerMove();
                swampList.get(i).setSwampPosition((int) (Math.random() * 10 + 1) + player.playerPosition);
                ChangeSpeed.swampChangeSpeed(swampList.get(i).getSwampPosition(), player.playerPosition);

                player.playerHealth -= 20;

                System.out.println("Здоровье " + player.playerHealth);

                if (player.playerHealth <= 0) {
                    player.playerDeath();
                    break;
                }
            }

        }


        //}


    }

}
