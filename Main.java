import java.util.Random;

public class PioGame {
    public static void main(String[] args) {

        Player player = new PlayerHuman("ziomal");

        Random rand = new Random();
        int number;
        int guess;

        do {
            System.out.println("---------------------");

            number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            guess = player.guess();
            System.out.println("Gracz " + player.getName() + ": " + guess);

            if (number != guess) {
                System.out.println("PUDŁO!");
            }

        } while (number != guess);

        System.out.println("BRAWO!");
    }

}
