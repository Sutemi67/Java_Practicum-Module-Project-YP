import java.util.ArrayList;
import java.util.Scanner;

class AskingCalculator {
    ArrayList<String> goodsNames = new ArrayList<>();
    ArrayList<Double> goodsPrices = new ArrayList<>();
    Scanner inputNameScanner = new Scanner(System.in);


    public void asking() {
        while (true) {
            System.out.println("Введите название товара, либо команду 'Завершить':");
            String inputName = inputNameScanner.nextLine();

            if (inputName.equalsIgnoreCase("Завершить")) {
                return;
            }
            goodsNames.add(inputName);

            System.out.println("Введите цену товара:");

            double inputPrice;
            while (true) {
                if (inputNameScanner.hasNextDouble()) {
                    inputPrice = inputNameScanner.nextDouble();
                    if (inputPrice >= 0) {
                        goodsPrices.add(inputPrice);
                        System.out.println("Товар успешно добавлен. Хотите добавить еще один товар?");
                        inputNameScanner.nextLine();
                        break;
                    } else {
                        System.out.println("Цена не может быть меньше нуля. Введите ещё раз:");
                    }
                } else {
                    System.out.println("Ошибка в цене. Введите еще раз:");
                    inputNameScanner.next();
                }
            }
        }
    }

    public void calculating(int count) {
        System.out.println("Добавленные товары:");
        double result = 0.0;
        for (int i = 0; i < goodsPrices.size(); i++) {
            System.out.println(goodsNames.get(i));
            result += goodsPrices.get(i);
        }
        double summary = result / count;
        int secondLastNumber = (int) Math.floor(summary) % 100 / 10;

        if (secondLastNumber == 1) {
            String messageTemplate = "С человека: %.2f рублей";
            System.out.printf((messageTemplate) + "%n", summary);
        } else {

            int resultInt = (int) summary;

            switch (resultInt % 10) {
                case 1 -> {
                    String messageTemplate = "С человека: %.2f рубль";
                    System.out.printf((messageTemplate) + "%n", summary);
                }
                case 2, 3, 4 -> {
                    String messageTemplate = "С человека: %.2f рубля";
                    System.out.printf((messageTemplate) + "%n", summary);
                }
                default -> {
                    String messageTemplate = "С человека: %.2f рублей";
                    System.out.printf((messageTemplate) + "%n", summary);
                }
            }
        }
    }
}