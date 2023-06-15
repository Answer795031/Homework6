import java.lang.Math;
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
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");

        /*
        С помощью цикла for выведите в консоль все числа от 1 до 10.
         */

        for (int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }

        System.out.println(" \n");
    }

    public static void task2() {
        System.out.println("Задача 2");

        /*
        С помощью цикла for выведите в консоль все числа от 10 до 1.
         */

        for (int i = 10; i >= 1; i --){
            System.out.print(i + " ");
        }

        System.out.println(" \n");

    }

    public static void task3() {
        System.out.println("Задача 3");

        /*
        Выведите в консоль все четные числа от 0 до 17.
         */

        // способ 1
        for (int i = 0; i <= 17; i += 2){
            System.out.print(i + " ");
        }
        System.out.println(" \n");

        //способ 2 для разнообразия
        for (int i = 0; i <=17; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
            } else{
                continue;
            }
        }

        System.out.println(" \n");

    }

    public static void task4() {
        System.out.println("Задача 4");

        /*
        Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.
         */

        for (int i = 10; i >= -10; i--){
            System.out.print(i + " ");
        }

        System.out.println(" \n");

    }

    public static void task5() {
        System.out.println("Задача 5");

        /*
        Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
        В консоль результат должен выводиться в формате: «… год является високосным».
         */

        int startYear = 1904;       // Стартовый год
        int endYear = 2096;         // Конечный год

        // Цикл корректно работает на любой выборке годов

        for (int i = startYear; i <= endYear; i++){
            if (i % 4 != 0 || (i % 100 == 0 && i % 400 != 0)){
                continue;
            } else{
                System.out.println(i + " год является високосным");
            }
        }
        System.out.println(" ");

    }

    public static void task6() {
        System.out.println("Задача 6");

        /*
        Напишите программу, которая выводит в консоль последовательность чисел:
        7 14 21 28 35 42 49 56 63 70 77 84 91 98
         */

        // способ 1 - сложение
        for (int i = 7; i <= 98; i += 7){
            System.out.print(i + " ");
        }
        System.out.println(" \n");

        // способ 2 - остаток
        for (int i = 1; i <= 100; i++){
            if (i % 7 == 0){
                System.out.print(i + " ");
            } else{
                continue;
            }
        }
        System.out.println(" \n");

        // способ 3 - умножение
        for (int i = 1; i <= 14; i++){
            System.out.print(i * 7 + " ");
        }
        System.out.println(" \n");
    }

    public static void task7() {
        System.out.println("Задача 7");

        /*
        Напишите программу, которая выводит в консоль последовательность чисел:
        1 2 4 8 16 32 64 128 256 512
         */

        //способ 1
        for (int i = 1; i <= 512; i *= 2){

            System.out.print(i + " ");
        }
        System.out.println(" \n");

        //способ 2 - для разнообразия, он больше нравится
        int digit = 2;
        for (int i = 0; i <= 9; i ++){
            System.out.print((int) Math.pow(digit,i) + " ");
        }
        System.out.println(" \n");

    }

    public static void task8() {
        System.out.println("Задача 8");

        /*
        Посчитайте с помощью цикла for сумму годовых накоплений,
        если каждый месяц вы будете откладывать по 29 000 рублей «в банку».
        Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
         */

        int monthCash = 29000;
        int totalCash = 0;
        for (int i = 1; i <= 12; i ++){
            totalCash += monthCash;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalCash + " рублей");
        }
        System.out.println(" ");

    }

    public static void task9() {
        System.out.println("Задача 9");

        /*
        Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в банку»,
        а в банк под проценты — 12% годовых. Выведите сумму накоплений за каждый месяц в консоль в формате:
        «Месяц …, сумма накоплений равна … рублей».
         */

        double salary = 29000;                  // Размер ежемесячного пополнения вклада
        double total = 0;                       // Текущий остаток по вкладу

        /*
        Следующие 2 параметра не обязательны для нынешнего условия задачи,
        но обеспечивают работоспособность кода в случае ввода других параметров
        процента вклада и срока вклада.
        */

        double percent = 12.0;                  // Процент вклада
        int month = 12;                         // Срок вклада в месяцах

        percent /= month;                       // Количество ежемесячно начисляемых процентов

        for (int i = 1; i <= month; i++) {
            total += salary;                    // Пополнение вклада
            total += percent * (total / 100);   // Начисление процентов на остаток по вкладу: 1 мес. = 1%
            System.out.println("Месяц " + i + ", сумма накоплений равна " + (int) total + " рублей");

            /*
            В рамках данного решения определим, что пополнение вклада происходит в начале i-го месяца
            Результатом расчета и вывода в консоль является сумма на счете по прошествию i-го месяца с учетом процентов
            */
        }

        System.out.println(" ");

    }

    public static void task10() {
        System.out.println("Задача 10");

        /*
        Напишите программу, которая выводит в консоль таблицу умножения на 2
         */

        int a = 2;                                      // Умножаемое число

        for (int i = 1; i <= 10; i++){
            System.out.println(a + " * " + i + " = " + a * i);
        }
        System.out.println(" \n");

        // Бонус, просто пробовал для себя:
        int result;

        for (int i = 1; i <= 9; i++){                   // первый множитель
            for (int j = 1; j <= 9; j++){               // Второй множитель
                result = i * j;
                System.out.print(j + " * " + i + " = " + result + "    ");

                // Чуток заморочился с тем чтобы при выводе таблица не съезжала когда в результате менее двух разрядов
                String resultString = "" + result;      // Приводим результат умножения к строковому типу
                int count = resultString.length();      // Вычисляем длину строки чтобы определить количество разрядов
                if (count == 1){
                    System.out.print(" ");              // Добавляем пробел если всего один разряд
                }
            }
            System.out.println(" \n");
        }

        System.out.println(" ");

    }
}

