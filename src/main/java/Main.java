import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AskingCalculator goods = new AskingCalculator();
        Scanner scanner = new Scanner(System.in);
        int peopleCount;

        while (true) {
            System.out.println("На скольких человек делить счет:");
            if (scanner.hasNextInt()) {
                peopleCount = scanner.nextInt();

                if (peopleCount <= 1) {
                    System.out.println("Мало людей, введите правильное значение");
                } else {
                    break;
                }
            } else {
                System.out.println("не число");
            }
            scanner.nextLine();
        }
        goods.asking();
        goods.calculating(peopleCount);
    }
}