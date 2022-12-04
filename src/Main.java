import ru.netology.tax.Tax;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int earnings = 0;//доход
        int spendings = 0;//расход
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int operation;

            System.out.println();
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать ситему налогооблажения");
            System.out.println("Ведите end для выхода из программы.");
            System.out.println();

            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            } else {
                operation = Integer.parseInt(input);
            }

            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода: ");
                    String moneyEarnings = scanner.nextLine();
                    int moneyEa = Integer.parseInt(moneyEarnings);
                    earnings += moneyEa;
                    break;
                case 2:
                    System.out.println("Введите сумму расхода: ");
                    String moneySpendings = scanner.nextLine();
                    int moneySp = Integer.parseInt(moneySpendings);
                    spendings += moneySp;
                    break;
                case 3:
                    int resultTaxEarnings = Tax.taxEarnings(earnings);
                    int resultTaxEarningsMinusSpendings = Tax.taxEarningsMinusSpendings(earnings, spendings);
                    Tax.comparisonOfTheTaxationSystem(resultTaxEarnings, resultTaxEarningsMinusSpendings);
                    break;
                default:
                    System.out.println("Такой операции нет");
            }

        }
        System.out.println("Программа завершена!");
    }

}

