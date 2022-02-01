public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;
        int depositAmount = 1100;
        int bonus;

        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
        } else {
            bonus = 0;
        }

        int balance = initialBalance + depositAmount + bonus;
        System.out.println(" Платёж зачислен. Сумма на счёте: " + balance + " руб.\n Ваш бонус составляет: " + bonus + " руб.");

    }
}
