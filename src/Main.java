public class Main {
    public static void main(String[] args) {
        //  задача 1
        System.out.println("задача 1");
        int salary = 15000;
        int total = 0;
        for (int i = 0; total < 2459000; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + "  , сумма накоплений равна " + total + " рублей");
            System.out.println(total);
        }
        //  задача 2
        System.out.println("задача 2");

        int number = 0;
        while (number < 10) {
            number = number + 1;
            System.out.print(number);
        }
        System.out.println(" ");
        int count = 11;
        while (count > 1) {
            count = count - 1;
            System.out.print(count);
        }
        System.out.println(" ");
        //  задача 3
        System.out.println("задача 3");

        int totalPopulation = 12_000_000;
        for (int i = 0; i < 11; i++) {
            totalPopulation = totalPopulation + (totalPopulation * 17 / 1000 - totalPopulation * 8 / 1000);
            System.out.println("Год " + i + "  , численность населения земли составляет " + totalPopulation + " человек");
        }
        //  задача 4
        System.out.println("задача 4");
        int salary1 = 15000;
        int total1 = 0;
        for (int i = 0; total1 < 12_000_000; i++) {
            total1 = total1 * 107 / 100;
            total1 = total1 + salary1;
            System.out.println("Месяц " + i + "  , сумма накоплений равна " + total1 + " рублей");
        }
        //  задача 5
        System.out.println("задача 5");
        int salary2 = 15000;
        int total2 = 0;
        for (int i = 0; total2 < 12_000_000; i++) {
            total2 = total2 * 107 / 100;
            total2 = total2 + salary2;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + "  , сумма накоплений равна " + total2 + " рублей");
            }
        }
        System.out.println(total2);// к 59-ому месяцу

        //  задача 6
        System.out.println("задача 6");
        int salary3 = 15000;
        long total3 = 0l;
        for (int i = 0; i < 109; i++) {
            total3 = total3 * 107 / 100;
            total3 = total3 + salary3;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + "  , сумма накоплений равна " + total3 + " рублей");
            }
        }
        System.out.println(total3);

        //  задача 7
        System.out.println("задача 7");
        for (int i = 0; i < 32; i++)
            for (int todayIsFriday = 2; todayIsFriday < 32; todayIsFriday = todayIsFriday + 7) {
                boolean Friday = todayIsFriday == i;
                if (Friday)
                    System.out.println(" Сегодня пятница, " + i + " -е число. Необходимо предоставить отчет.");
            }

        //  задача 8
        System.out.println("задача 8");
        for (int i = 0; i < 2100; i = i + 79) {
            if (i > 1850 && i < 2100) {
                System.out.println(i);
            }
        }
        System.out.println("задача 8");

        int i = 2;
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }

