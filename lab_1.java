import java.util.Scanner;
import java.util.Arrays;

public class lab_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задача 1: Букву в число");
        System.out.print("Введите одну цифру от 0 до 9: ");
        String input1 = scanner.nextLine();
        if (input1.length() == 1 && input1.charAt(0) >= '0' && input1.charAt(0) <= '9') {
            System.out.println("Результат: " + charToNum(input1.charAt(0)));
        } else {
            System.out.println("Это не цифра!");
        }

        System.out.println("\nЗадача 2: Есть ли позитив");
        int x2 = readInt(scanner, "Введите целое число: ");
        System.out.println("Результат: " + isPositive(x2));

        System.out.println("\nЗадача 3: Делитель");
        int a3 = readInt(scanner, "Введите первое целое число (a): ");
        int b3 = readInt(scanner, "Введите второе целое число (b): ");
        System.out.println("Результат: " + isDivisor(a3, b3));

        System.out.println("\nЗадача 4: Равенство");
        int a4 = readInt(scanner, "Введите первое целое число (a): ");
        int b4 = readInt(scanner, "Введите второе целое число (b): ");
        int c4 = readInt(scanner, "Введите третье целое число (c): ");
        System.out.println("Результат: " + isEqual(a4, b4, c4));

        System.out.println("\nЗадача 5: Многократный вызов");
        int res5 = readInt(scanner, "Введите первое число: ");
        for (int i = 2; i <= 5; i++) {
            int next5 = readInt(scanner, "Введите число " + i + ": ");
            res5 = lastNumSum(res5, next5);
            System.out.println("Промежуточный результат: " + res5);
        }
        System.out.println("Итого: " + res5);

        System.out.println("\nЗадача 6: Безопасное деление");
        int x6 = readInt(scanner, "Введите первое целое число (x): ");
        int y6 = readInt(scanner, "Введите второе целое число (y): ");
        System.out.println("Результат: " + safeDiv(x6, y6));

        System.out.println("\nЗадача 7: Тройной максимум");
        int x7 = readInt(scanner, "Введите первое целое число (x): ");
        int y7 = readInt(scanner, "Введите второе целое число (y): ");
        int z7 = readInt(scanner, "Введите третье целое число (z): ");
        System.out.println("Результат: " + max3(x7, y7, z7));

        System.out.println("\nЗадача 8: Тройная сумма");
        int x8 = readInt(scanner, "Введите первое целое число (x): ");
        int y8 = readInt(scanner, "Введите второе целое число (y): ");
        int z8 = readInt(scanner, "Введите третье целое число (z): ");
        System.out.println("Результат: " + sum3(x8, y8, z8));

        System.out.println("\nЗадача 9: Двойная сумма");
        int x9 = readInt(scanner, "Введите первое целое число (x): ");
        int y9 = readInt(scanner, "Введите второе целое число (y): ");
        System.out.println("Результат: " + sum2(x9, y9));

        System.out.println("\nЗадача 10: Вывод дней недели");
        System.out.print("Введите день недели с маленькой буквой: ");
        String day10 = scanner.nextLine().trim().toLowerCase();
        System.out.println("Результат:");
        printDays(day10);

        System.out.println("\nЗадача 11: Числа подряд");
        int x11 = readInt(scanner, "Введите любое целое положительное число: ");
        System.out.println("Результат: " + listNums(x11));

        System.out.println("\nЗадача 12: Степень числа");
        int x12 = readInt(scanner, "Введите любое целое число: ");
        int y12 = readInt(scanner, "Введите любое целое положительное число: ");
        while (y12 < 0) {
            System.out.print("Степень не может быть отрицательной! Повторите ввод: ");
            y12 = readInt(scanner, "");
        }
        System.out.println("Результат: " + pow(x12, y12));

        System.out.println("\nЗадача 13: Одинаковость");
        int x13 = readInt(scanner, "Введите любое целое число: ");
        System.out.println("Результат: " + equalNum(x13));

        System.out.println("\nЗадача 14: Квадрат");
        int x14 = readInt(scanner, "Введите любое целое число: ");
        System.out.println("Результат:");
        square(x14);

        System.out.println("\nЗадача 15: Правый треугольник");
        int x15 = readInt(scanner, "Введите любое целое положительное число: ");
        System.out.println("Результат:");
        rightTriangle(x15);

        System.out.println("\nЗадача 16: Поиск первого значения");
        int[] arr16 = {1, 2, 3, 4, 5, 6, 19, 23};
        int x16 = readInt(scanner, "Введите любое число для нахождения его в массиве: ");
        System.out.println("Результат: " + findFirst(arr16, x16));

        System.out.println("\nЗадача 17: Поиск последнего значения");
        int[] arr17 = {1, 2, 3, 2, 2, 2, 4, 5, 5, 20};
        int x17 = readInt(scanner, "Введите искомое целое число: ");
        System.out.println("Результат: " + findLast(arr17, x17));

        System.out.println("\nЗадача 18: Добавление массива в массив");
        int[] arr18 = {1, 2, 3, 2, 4, 5, 5, 20};
        int[] ins18 = {2, 4, 8, 9, 1000};
        int pos18 = readInt(scanner, "Введите номер позиции для вставки: ");
        System.out.println("Результат: " + Arrays.toString(add(arr18, ins18, pos18)));

        System.out.println("\nЗадача 19: Объединение");
        System.out.println("Введите целые числа через пробел для создания массива arr1:");
        String input19_1 = scanner.nextLine();
        String[] parts19_1 = input19_1.split(" ");
        int[] arr19_1 = new int[parts19_1.length];
        for (int i = 0; i < parts19_1.length; i++) {
            arr19_1[i] = Integer.parseInt(parts19_1[i]);
        }

        System.out.println("Введите целые числа через пробел для создания массива arr2:");
        String input19_2 = scanner.nextLine();
        String[] parts19_2 = input19_2.split(" ");
        int[] arr19_2 = new int[parts19_2.length];
        for (int i = 0; i < parts19_2.length; i++) {
            arr19_2[i] = Integer.parseInt(parts19_2[i]);
        }
        System.out.println("Результат: " + Arrays.toString(concat(arr19_1, arr19_2)));

        System.out.println("\nЗадача 20: Удалить негатив");
        System.out.println("Введите целые числа через пробел для создания массива arr:");
        String input20 = scanner.nextLine();
        String[] parts20 = input20.split(" ");
        int[] arr20 = new int[parts20.length];
        for (int i = 0; i < parts20.length; i++) {
            arr20[i] = Integer.parseInt(parts20[i]);
        }
        System.out.println("Результат: " + Arrays.toString(deleteNegative(arr20)));

        scanner.close();
    }

    public static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод! Повторите попытку.");
            }
        }
    }

    public static int charToNum(char x) {
        return x - '0';
    }

    public static boolean isPositive(int x) {
        return x > 0;
    }

    public static boolean isDivisor(int a, int b) {
        if (a == 0 || b == 0) {
            return false;
        }
        return b % a == 0 || a % b == 0;
    }

    public static boolean isEqual(int a, int b, int c) {
        if ((a == b) && (b == c)) {
            return true;
        } else {
            return false;
        }
    }

    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }

    public static double safeDiv(int x, int y) {
        if (y == 0) {
            return 0;
        } else {
            return (double) x / y;
        }
    }

    public static int max3(int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }

    public static boolean sum3(int x, int y, int z) {
        if (x + y == z) {
            return true;
        } else if (x + z == y) {
            return true;
        } else if (y + z == x) {
            return true;
        } else {
            return false;
        }
    }

    public static int sum2(int x, int y) {
        if (((x + y) >= 10) && ((x + y) <= 19)) {
            return 20;
        } else {
            return x + y;
        }
    }

    public static void printDays(String x) {
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("Это не день недели");
        }
    }

    public static String listNums(int x) {
        String result = "";
        for (int i = 0; i <= x; i++) {
            result = result + i + " ";
        }
        return result.trim();
    }

    public static int pow(int x, int y) {
        int result = 1;
        for (int i = 1; i <= y; i++) {
            result = result * x;
        }
        return result;
    }

    public static boolean equalNum(int x) {
        x = Math.abs(x);
        int standart = x % 10;
        boolean resualt = true;
        while (x > 0) {
            int predlast = x % 10;
            if (predlast != standart) {
                resualt = false;
            }
            x = x / 10;
        }
        return resualt;
    }

    public static void square(int x) {
        x = Math.abs(x);
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = i; j < x; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int findLast(int[] arr, int x) {
        int lastch = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastch = i;
            }
        }
        return lastch;
    }

    public static int[] add(int[] arr, int[] ins, int pos) {
        if (pos < 0) {
            pos = 0;
        }
        if (pos > arr.length) {
            pos = arr.length;
        }
        int[] result = new int[arr.length + ins.length];
        int index = 0;
        for (int i = 0; i < pos; i++) {
            result[index] = arr[i];
            index++;
        }
        for (int i = 0; i < ins.length; i++) {
            result[index] = ins[i];
            index++;
        }
        for (int i = pos; i < arr.length; i++) {
            result[index] = arr[i];
            index++;
        }
        return result;
    }

    public static int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            result[index] = arr1[i];
            index++;
        }
        for (int i = 0; i < arr2.length; i++) {
            result[index] = arr2[i];
            index++;
        }
        return result;
    }

    public static int[] deleteNegative(int[] arr) {
        int leng = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                leng++;
            }
        }
        int[] result = new int[leng];
        if (leng == 0) {
            return result;
        }
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }
}