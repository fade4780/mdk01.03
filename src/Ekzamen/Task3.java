package Ekzamen;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] expenses = new int[7];
        int totalExpenses = 0;
        System.out.println("Расходики за недельку:");
        for (int i = 0; i < expenses.length; i++){
            expenses[i] = 2000 + random.nextInt(5001);
            totalExpenses += expenses[i];
            System.out.println("День "+ (i + 1) + ":" + expenses[i] +"Рублей");
        }
        System.out.println("Общаие траты за неделю: "+ totalExpenses + "Рублей");
    }
}
