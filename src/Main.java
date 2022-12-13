

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] spending = generateRandomArray();
        int sumSpending = 0;
        for (int i = 0; i < spending.length; i++) {
            sumSpending = sumSpending + spending[i];
        }
        System.out.println("Сумма всех трат за месяц составила " + sumSpending + " рублей.");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] spending = generateRandomArray();
        int maxSpending = -1;
        int minSpending = spending[0];
        for (int i = 0; i < spending.length; i++) {
            final int current = spending[i];
            if (current > maxSpending) {
                maxSpending = current;
            }
        }
        for (final int current : spending) {
            if (current < minSpending) {
                minSpending = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpending + " рублей. Максимальная сумма трат за день составила " + maxSpending + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] spending = generateRandomArray();
        double average = 0;
        if (spending.length > 0) {
            double sum = 0;
            for (int i = 0; i < spending.length; i++) {
                sum += spending[i];
            }
            average = sum / spending.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char length = 0;
        for (int element : reverseFullName) {
            length++;
        }
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}

