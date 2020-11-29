public class MobileOperatorBonus {
    public static void main (String[] args) {
        int currentAmountInKopecks = 100_87;
        int amountToReplenishInKopecks = 97_43;
        int coefficient = 100;
        int minAmountInKopecks = 100_00;

        System.out.println("Текущий баланс = " + (float)currentAmountInKopecks/100 + " руб.");
        System.out.println("Сумма пополнения счета = " + (float)amountToReplenishInKopecks/100 + " руб.");

        int bunusInKopecks = calculateBonus(amountToReplenishInKopecks, minAmountInKopecks, coefficient);
        currentAmountInKopecks += bunusInKopecks + amountToReplenishInKopecks;

        System.out.println("Начисленные бонусы = " + (float)bunusInKopecks/100 + " руб.");
        System.out.println("Баланс после пополненния = " + (float)currentAmountInKopecks/100 + " руб.");
    }

    public static int calculateBonus (int amountInKopecks, int minAmountInKopecks, int coefficient) {
        if (amountInKopecks > minAmountInKopecks) {
            return (amountInKopecks/coefficient/100) * 100;
        } else {
            return 0;
        }
    }
}
