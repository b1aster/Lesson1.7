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

        // Разделитель
        System.out.println();

        // Задание 1.2
        int counter = 0;

        while (counter < 10){
            counter++;

            System.out.print(counter);

            if (counter < 10)
                System.out.print(" ");
        }

        System.out.println();

        for (int i = counter; i >= 1; i--){
            System.out.print(i);

            if (i > 1)
                System.out.print(" ");
        }

    }
}