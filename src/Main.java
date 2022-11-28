public class Main {
    public static void main(String[] args) {

        // Задание 1.1
        int deposit = 0;
        int amount = 15_000;
        int goal = 2_459_000;
        int month = 0;

        while (deposit <= goal){
            deposit += amount;
            month++;

            System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
        }

    }
}