public class MobileOperatorBonus {
    public static void main (String[] args) {
        int currentAmountInKopecks = 100_87;
        int amountInKopecks = 97_43;
        int coefficient = 100;

        System.out.println("Текущий баланс = " + (float)currentAmountInKopecks/100 + " руб.");
        System.out.println("Сумма пополнения счета = " + (float)amountInKopecks/100 + " руб.");

        int bunusInKopecks = calculateBonus(amountInKopecks, coefficient);
        currentAmountInKopecks += bunusInKopecks + amountInKopecks;

        System.out.println("Начисленные бонусы = " + (float)bunusInKopecks/100 + " руб.");
        System.out.println("Баланс после пополненния = " + (float)currentAmountInKopecks/100 + " руб.");
    }

    public static int calculateBonus (int amountInKopecks, int coefficient) {
        if (amountInKopecks > (100 * 100)) {
            return (amountInKopecks/coefficient/100) * 100;
        } else {
            return 0;
        }
    }
}
