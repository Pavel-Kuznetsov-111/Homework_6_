public class Main {
    public static void main(String[] args) {
        System.out.println();

        for (int i = 1; i < 11; i = i + 1) {
            System.out.println(i);
        }

        for (int i = 10; i > 0; i = i - 1) {
            System.out.println(i);
        }

        for (int i = 0; i < 18; i = i + 2) {
            System.out.println(i);
        }

        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }

        for (int i = 1904; i < 2100; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        for (int i = 7; i < 105; i = i + 7) {
            System.out.println(i);
        }

        for (int i = 1; i < 1024; i = i * 2) {
            System.out.println(i);
        }

        int contribution = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + contribution;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + "рублей");
        }
        System.out.println(total);

        int contribution2 = 29000;
        int total2 = 0;
        for (int l = 1; l < 13; l++) {
            total2=total2+contribution2/100;
            total2 = total2 + contribution2;
            System.out.println("Месяц " + l + " сумма накоплений равна " + total2 + "рублей");
        }

        for (int i=1; i<=10; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }



    }
}