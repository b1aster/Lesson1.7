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


        // Разделитель
        System.out.println("\n");

        // Задание 1.3
        int population = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int demography = (population / 1000) * (birthRate - mortality);
        int calculateYears = 10;

        int year = 1;
        while (calculateYears >= 1){

            population += demography;

            System.out.println("Год " + year + ", численность населения составляет " + population);

            year++;
            calculateYears--;
        }

        // Разделитель
        System.out.println();

        // Задание 2.1
        deposit = 15_000; // Переменная была объявлена ранее
        float percentage = 7;

        int months = 0;
        while (deposit < 12_000_000){

            deposit += (deposit * (percentage / 100));

            months++;
        }

        System.out.println("За " + months + " месяцев Василий накопил " + deposit + " рублей");

        // Разделитель
        System.out.println();

        // Задание 2.2
        deposit = 15_000;
        months = 0;
        while (deposit < 12_000_000){

            deposit += (deposit * (percentage / 100));

            months++;

            if (months % 6 == 0)
                System.out.println("За " + months + " месяц Василий накопил " + deposit + " рублей");
        }

        // Разделитель
        System.out.println();

        // Задание 2.3
        int years = 9;
        deposit = 15_000;
        months = 0;

        while (months < years * 12){
            months++;

            deposit += (deposit * (percentage / 100));

            if (months % 6 == 0)
                System.out.println("За " + months + "-й месяц Василий накопил " + deposit + " рублей");
        }

        // Разделитель
        System.out.println();

        // Задание 2.4
        int daysInCurrentMonth = 31;
        int nextFriday = 4;

        for (int day = 1; day <= daysInCurrentMonth; day++){

            if (day == nextFriday) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
                nextFriday += 7;
            }
        }

        // Разделитель
        System.out.println();

        // Задание 3.1
        int currentYear = 2022;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;

        year = startYear;

        for (; year <= endYear; year++){

            if (year % 79 == 0)
                System.out.println(year);
        }
    }
}