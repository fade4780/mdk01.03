package Ekzamen;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму кредита:");
        double loanAmount = scanner.nextDouble();
        double interestRate = 0.25;
        double totalAmount = loanAmount * (1 + interestRate);
        double monthlyPayment = totalAmount / 12;
        double totalPaid = 0;
        int paymentsMade = 0;

        while (paymentsMade < 12) {
            System.out.println("\nМеню:");
            System.out.println("1.Внести платёж");
            System.out.println("2.Показать оставшуюся сумму");
            System.out.println("3.Показать количество оставшихся месяцев");
            System.out.println("4.Показать переплату");
            System.out.println("5.Выйти");
            System.out.println("Выберите действие: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    totalPaid += monthlyPayment;
                    paymentsMade++;
                    System.out.printf("Вы внесли платёж. Осталось " + (12 - paymentsMade) + "месяцев");
                    break;
                case 2:
                    double remaining = totalAmount - totalPaid;
                    System.out.printf("Оставшаяся сумма: %.2f Рублей%n", remaining);
                    break;
                case 3:
                    System.out.println("Осталось " + (12 - paymentsMade) + "месяцев.");
                    break;
                case 4:
                    double overpayment = totalPaid - loanAmount;
                    System.out.printf("Переплата: %.2f Рублей%n", overpayment);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
  }
}
