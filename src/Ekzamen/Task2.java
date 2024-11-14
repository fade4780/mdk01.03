package Ekzamen;
import java.util.Scanner;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int code = random.nextInt(11);
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Ракета на  орбите");
        while (true) {
            System.out.println("Введите код используя числа от 0 до 10, чтобы безопасно вернуть её на Землю");
            int guess = scanner.nextInt();
            if (guess == code) {
                System.out.println("Код верный! Ракета возвращается на Землю.");
                break;
            }
            else {
                System.out.println("Неверный код - ракета летит к тебе домой)))");
            }
        }
    }
}
