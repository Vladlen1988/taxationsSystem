package ru.netology.tax;

public class Tax {
    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }

    public static int taxEarnings(int earnings) {
        int tax = earnings * 6 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }

    public static void comparisonOfTheTaxationSystem(int resultTaxEarnings, int resultTaxEarningsMinusSpendings) {
        if (resultTaxEarnings < resultTaxEarningsMinusSpendings) {
            System.out.println("Мы советуем вам УСН доходы - налог 6% от доходов");
            System.out.println("Ваш налог составит: " + resultTaxEarnings);
            System.out.println("Налог на другой системе: " + resultTaxEarningsMinusSpendings);
            System.out.println("Экономия: " + (resultTaxEarningsMinusSpendings - resultTaxEarnings));
        } else if (resultTaxEarningsMinusSpendings < resultTaxEarnings) {
            System.out.println("Мы советуем вам УСН доходы минус расходы - налог 15%");
            System.out.println("Ваш налог составит: " + resultTaxEarningsMinusSpendings);
            System.out.println("Налог на другой системе: " + resultTaxEarnings);
            System.out.println("Экономия: " + (resultTaxEarnings - resultTaxEarningsMinusSpendings));
        }
    }
}
