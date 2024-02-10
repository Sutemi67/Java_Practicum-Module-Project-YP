import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AskingCalculator goods = new AskingCalculator();
        int peopleCount;

        while (true) {
            System.out.println("На скольких человек делить счет:");
            Scanner peopleCounter = new Scanner(System.in);
            if (peopleCounter.hasNextInt()) {
                peopleCount = peopleCounter.nextInt();
                if (peopleCount <= 1) {
                    System.out.println("Мало людей, введите правильное значение");
                }else{
                    break;
                }
            } else {
                System.out.println("Некорректные данные. Пожалуйста, введите число");
            }
        }
            goods.asking();
            goods.calculating(peopleCount);
        }
    }
