public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Задача 1");
        int total = 0;
        int sum = 2_459_000;
        int money = 15000;
        int month = 1;
        while (total <= sum) {
            total = total + money;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            month += 1;
        }

        System.out.println();

        ////Task 2
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i += 1;
        }
        System.out.println();
        for (int a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println();

        //Task 3
        System.out.println("Задача 3");
        int year = 2025;
        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        for (i = 1; i <= 10; i++) {
            population = population + ((population / 1000) * birthRate) - ((population / 1000) * deathRate);
            System.out.println("Год " + year + ", численность населения составляет " + population);
            year += 1;
        }

        //Task 4
        System.out.println("Задача 4");
        float cash = 15000f;
        float percent = 0.07f;
        float accumulatedAmount = 12_000_000f;
        int months = 0;
        while (cash <= accumulatedAmount) {
            cash = cash + (cash * percent);
            months += 1;
            System.out.println("Месяц " + months + ", сумма накоплений " + cash);
        }
        System.out.println();

        //Task 5
        System.out.println("Задача 5");
        float monies = 15000f;
        float percentage = 0.07f;
        float accumulatedCash = 12_000_000f;
        int monthsEverySixth = 0;
        while (monies <= accumulatedCash) {
            monies = monies + (monies * percentage);
            monthsEverySixth += 1;
            if (monthsEverySixth % 6 == 0) {
                System.out.println("За " + monthsEverySixth + "-й месяц сумма накоплений составляет " + monies);
            }
        }
        System.out.println();

        //Task 6
        System.out.println("Задача 6");
        int years = 9;
        int yearsInMohths = years * 12;
        int everySixthMonths = 6;
        float cashVasiliy = 15000f;
        float percentageOfBank = 0.07f;
        for (; everySixthMonths <= yearsInMohths; everySixthMonths++) {
            cashVasiliy = cashVasiliy + (cashVasiliy * percentageOfBank);
            if (everySixthMonths % 6 == 0) {
                System.out.println("За " + everySixthMonths + "-й месяц сумма накоплений составляет " + cashVasiliy);
            }
        }
        System.out.println();

        //Task 7
        System.out.println("Задача 7");
        int numberFirstFriday = 4;
        int daysInMonth = 31;
        for (; numberFirstFriday <= daysInMonth; numberFirstFriday += 7) {
            System.out.println("Сегодня пятница, " + numberFirstFriday + "-е число. Необходимо подготовить отчет");
        }
        System.out.println();

        //Task 8
        System.out.println("Задача 8");
        int currentYear = 2025;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        while (startYear <= endYear) {
            startYear +=1;
            if (startYear % 79 == 0) {
                System.out.println(startYear);
            }
        }



    }
}