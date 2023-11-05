public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }

    public static void task1() {
        int total = 0;
        int salary = 15000;
        int target = 2_459_000;
        int month = 0;
        while (total < target) {
            total = total + salary;
            month++;
            System.out.println(" Месяц " + month + " сумма накопления равна " + total + " рублей ");

        }
    }

    public static void task2() {
        int counter = 1;
        while (counter <= 10) {
            System.out.println(counter + "  ");
            counter++;
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.println(i + "  ");
        }

    }

    public static void task3() {
        double population = 12_000_000;
        int diff = 17 - 8;
        for (int i = 0; i < 10; i++) {
            double addition = population / 1000 * diff;
            population = population + addition;
            System.out.println(" Год " + (i + 1) + " , численность насиления составляет " + (int) population);

        }
    }

    public static void task4() {
        double total = 15_000;
        double diff = 1.07;
        int month = 0;
        while (total < 12_000_000) {
            total *= diff;
            month++;
            System.out.println(" Месяц " + month + " сумма  " + (int) total);


        }
    }

    public static void task5() {
        double total = 15_000;
        double diff = 1.07;
        int month = 0;
        while (total < 12_000_000) {
            total *= diff;
            month++;
            if (month % 6 == 0) {
                System.out.println(" Месяц " + month + " сумма  " + (int) total);
            }
        }
    }

    public static void task6() {
        double total = 15_000;
        double diff = 1.07;
        int month = 0;
        while (total < 12 * 9) {
            total *= diff;
            month++;
            if (month % 6 == 0) {
                System.out.println(" Месяц " + month + " сумма  " + (int) total);
            }
        }
    }

    public static void task7() {
        int friday = 4;
        for (int i = friday; i <= 31; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task8() {
        int friday = 4;
        for (int i = 2023 - 200; i <= 2023 + 100; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}





