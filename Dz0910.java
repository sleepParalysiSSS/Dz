import java.util.Random;
import java.util.Scanner;

public class Dz0910  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=== Игра 'Угадай число' ===");

        while (true) {
            int secret = random.nextInt(11); // число от 0 до 10
            int attempts = 3;

            for (int i = 1; i <= attempts; i++) {
                System.out.print("Попытка " + i + ": введите число от 0 до 10: ");
                int guess = Integer.parseInt(scanner.nextLine());

                if (guess == secret) {
                    System.out.println("Вы угадали!");
                    break;
                } else if (guess < secret) {
                    System.out.println("Загаданное число больше.");
                } else {
                    System.out.println("Загаданное число меньше.");
                }

                if (i == attempts) {
                    System.out.println("Nice try. Загаданное число: " + secret);
                }
            }

            System.out.print("Повторить игру? 1 - да, 0 - нет: ");
            String answer = scanner.nextLine();

            if (answer.equals("0")) {
                System.out.println("Ну и не очень то хотелось!");
                break;
            }

            System.out.println("--- Новая игра ---");
        }

        scanner.close();
    }
}



