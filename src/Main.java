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
        System.out.println("Задача 1");
        byte a = 32;
        System.out.println("Значение переменной " + a + " равно");
        int b = 9548854;
        System.out.println("Значение переменной " + b + " равно");
        short c = 29254;
        System.out.println("Значение переменной " + c + " равно");
        long d = 992151274;
        System.out.println("Значение переменной " + d + " равно");
        float f = 23.254f;
        System.out.println("Значение переменной " + f + " равно");
        double g = 3259.5244;
        System.out.println("Значение переменной " + g + " равно");
    }
    public static void task2() {
        System.out.println("Задача 2");
        byte a = 67;
        System.out.println("Значение переменной " + a + " равно");
        int b = 27897;
        System.out.println("Значение переменной " + b + " равно");
        short c = -159;
        System.out.println("Значение переменной " + c + " равно");
        long d = 987678965549L;
        System.out.println("Значение переменной " + d + " равно");
        float f = 27.12f;
        System.out.println("Значение переменной " + f + " равно");
        double g = 2.786;
        System.out.println("Значение переменной " + g + " равно");
        short h = 569;
        System.out.println("Значение переменной " + h + " равно");
    }
    public static void task3() {
        System.out.println("Задача 3");
        byte a = 23;
        byte b = 27;
        byte c = 30;
        int d = 480 / ( a + b + c );
        System.out.println("На каждого ученика рассчитано " + d +
                " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte a = 16;
        byte b = 2;
        int minuteBottle = a / b;
        byte c = 20;
        int minute20 = c * minuteBottle;
        System.out.println("За " + c + " минут машина произвела "
                + minute20 + " штук бутылок");
        byte hour = 60;
        int day = hour * 24;
        int dayBottle = day * minuteBottle;
        System.out.println("За " + day + " минут машина произвела "
                + dayBottle + " штук бутылок");
        int days3 = day * 3;
        int days3Bottle = days3 * minuteBottle;
        System.out.println("За " + days3 + " минут машина произвела "
                + days3Bottle + " штук бутылок");
        byte months = 31;
        int monthsBottle = months * days3Bottle;
        System.out.println("За " + months + " дней машина произвела "
                + monthsBottle + " штук бутылок");

    }
    public static void task5() {
        System.out.println("Задача 5");
        byte allB = 120;
        byte whiteB = 2;
        byte brownB = 4;
        int classB = whiteB + brownB;
        int class1 = allB / classB;
        int allWhite = class1 * whiteB;
        int allBrown = class1 * brownB;
        System.out.println("В школе, где " + class1 + " классов, нужно " + allWhite
        + " банок белой краски и " + allBrown + " банок коричневой краски");

    } public static void task6() {
        System.out.println("Задача 6");
        byte bananas = 5;
        short milk = 2;
        byte ice = 2;
        byte eggs = 4;
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte iceWeight = 100;
        byte eggsWeight = 70;
        int weight = (bananas * bananaWeight) + (milk * milkWeight) + (ice * iceWeight)
                + (eggs * eggsWeight);
        System.out.println("Вес спортзавтрака " + weight + " грамм");
        int weightKg = weight / 1000;
        System.out.println("Вес спортзавтрака " + weightKg + " килограмм");

    }
    public static void task7() {
        System.out.println("Задача 7");
        byte weightKg = 7;
        short a = 250;
        short b = 500;
        int weightGr = weightKg * 1000;
        int daysOne = weightGr / a;
        System.out.println( daysOne + " дней уйдет на похудение, если спортсмен будет терять каждый день по "
        + a + " грамм");
        int dayTwo = weightGr / b;
        System.out.println( dayTwo + " дней уйдет на похудение, если спортсмен будет терять каждый день по "
                + b + " грамм");
    }
    public static void task8() {
        System.out.println("Задача 8");
        long m = 67760;
        long d = 83690;
        long k = 76230;
        long mNew = (m / 100 * 10) +m;
        long dNew = (d / 100 * 10) +d;
        long kNew = (k / 100 * 10) +k;
        long mY = (mNew * 12) - (m * 12);
        long dY = (dNew * 12) - (d * 12);
        long kY = (kNew * 12) - (k * 12);
        System.out.println("Маша теперь получает " + mNew + " рублей. Годовой доход вырос на " + mY + " рублей");
        System.out.println("Денис теперь получает " + dNew + " рублей. Годовой доход вырос на " + dY + " рублей");
        System.out.println("Кристина теперь получает " + kNew + " рублей. Годовой доход вырос на " + kY + " рублей");
    }


}