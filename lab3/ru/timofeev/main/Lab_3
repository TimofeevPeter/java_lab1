package ru.timofeev.main;

import ru.timofeev.home.Home;
import ru.timofeev.gun.Gun;
import ru.timofeev.gun.AutomatGun;
import ru.timofeev.list.ImmutableValueList;
import ru.timofeev.point.Point;
import ru.timofeev.shooter.Shooter;


import java.util.Scanner;
import java.util.Arrays;

public class Lab_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Задание 1.1
        System.out.println("Задание 1.1");
        int floor = readInt(scanner, "Введите количество этажей дома (количество должно быть целым и положительным числом): ");
        try {
            Home home = new Home(floor);
            System.out.println("Результат: " + home);
        } catch (IllegalArgumentException e) {
            System.out.println("Результат: " + e.getMessage());
        }

        //Задание1.5
        System.out.println("\nЗадание 1.5");
        Gun gun = new Gun(7, 3);

        while (true) {
            System.out.println("\nДоступные команды:");
            System.out.println("1 - Выстрелить");
            System.out.println("2 - Перезарядить");
            System.out.println("3 - Разрядить");
            System.out.println("4 - Узнать количество патронов");
            System.out.println("5 - Узнать вмещаемость пистолета");
            System.out.println("6 - Узнать, заряжен пистолет или нет");
            System.out.println("7 - Выход в следующее задание");
            System.out.print("Ваш выбор: ");

            String command = scanner.nextLine();

            if (command.equals("7")) {
                System.out.println("Завершение работы с пистолетом.");
                break;
            }

            switch (command) {
                case "1":
                    gun.shoot();
                    break;
                case "2":
                    int count = readInt(scanner, "Сколько вы хотите зарядить патронов? ");
                    int load = gun.reload(count);
                    if (load > 0) {
                        System.out.println("Возвращено патронов: " + load);
                    }
                    break;
                case "3":
                    int taken = gun.unload();
                    System.out.println("Возвращено патронов: " + taken);
                    break;
                case "4":
                    System.out.println("Количество патронов: " + gun.getAmmo());
                    break;
                case "5":
                    System.out.println("Вмещаемость патронов в пистолете: " + gun.getFullammo());
                    break;
                case "6":
                    System.out.println("Заряженность пистолета: " + gun.isLoaded());
                    break;
                default:
                    System.out.println("Неизвестная команда. Повторите попытку.");
            }
        }

        //Задание 2
        System.out.println("\nЗадание 2. Неизменяемый список значений:");
        int size = readInt(scanner, "Введите количество элементов: ");
        int[] tempArray = new int[size];

        for (int i = 0; i < size; i++) {
            tempArray[i] = readInt(scanner, "Введите элемент [" + i + "]: ");
        }

        ImmutableValueList list = new ImmutableValueList(tempArray);
        System.out.println("\nСоздан список: " + list);

        boolean listMenuActive = true;
        while (listMenuActive) {
            System.out.println("\n--- Меню списка ---");
            System.out.println("1 - Получить элемент по индексу");
            System.out.println("2 - Заменить элемент");
            System.out.println("3 - Показать размер");
            System.out.println("4 - Проверить, пуст ли список");
            System.out.println("5 - Получить в виде массива");
            System.out.println("6 - Показать список");
            System.out.println("0 - Выход в следующее задание");
            System.out.print("Выберите команду: ");

            String command = scanner.nextLine();

            switch (command) {
                case "1":
                    int getIndex = readInt(scanner, "Введите индекс (0-" + (list.size() - 1) + "): ");
                    try {
                        System.out.println("Значение: " + list.get(getIndex));
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case "2":
                    int setIndex = readInt(scanner, "Введите индекс (0-" + (list.size() - 1) + "): ");
                    int newValue = readInt(scanner, "Введите новое значение: ");
                    try {
                        list.set(setIndex, newValue);
                        System.out.println("Список после замены: " + list);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case "3":
                    System.out.println("Размер списка: " + list.size());
                    break;
                case "4":
                    System.out.println("Список пуст? " + list.isEmpty());
                    break;
                case "5":
                    int[] array = list.toArray();
                    System.out.println("Массив: " + Arrays.toString(array));
                    if (array.length > 0) {
                        array[0] = 999;
                        System.out.println("После изменения копии массива, исходный список не изменился: " + list);
                    }
                    break;
                case "6":
                    System.out.println("Список: " + list);
                    break;
                case "0":
                    System.out.println("Выход из меню списка.");
                    listMenuActive = false;
                    break;
                default:
                    System.out.println("Неизвестная команда. Попробуйте снова.");
            }
        }

        //Задание 3
        System.out.println("\nЗадача 4: Автомат");

        int fullAmmo = readInt(scanner, "Введите вместимость обоймы: ");
        int fireRate = readInt(scanner, "Введите скорострельность (выстрелов в секунду): ");

        AutomatGun agun = new AutomatGun(fullAmmo, fireRate);
        System.out.println("\nСоздан: " + agun);

        System.out.println("\nСтреляем очередью:");
        agun.shoot();

        int seconds = readInt(scanner, "\nСколько секунд стрелять? ");
        System.out.println("\nСтреляем " + seconds + " секунд:");
        agun.shoot(seconds);

        System.out.println("\nОсталось патронов: " + agun.getAmmo());

        scanner.close();


        // Задание 5: Лучший стрелок
        System.out.println("\nЗадание 8: Лучший стрелок\n");

        // 1. Стрелок без оружия
        Shooter shooter1 = new Shooter("Голяк", null);
        System.out.println(shooter1.getName() + ":");
        shooter1.shoot();

        // 2. Стрелок с пистолетом
        Gun pistol = new Gun(7, 3);
        Shooter shooter2 = new Shooter("Ковбой", pistol);
        System.out.println("\n" + shooter2.getName() + ":");
        shooter2.shoot();

        // 3. Стрелок с автоматом
        AutomatGun rifle = new AutomatGun(100, 8);
        Shooter shooter3 = new Shooter("Пулемётчик", rifle);
        System.out.println("\n" + shooter3.getName() + ":");
        shooter3.shoot();

        // Смена оружия
        System.out.println("\nСмена оружия");
        shooter1.setWeapon(pistol);
        System.out.println(shooter1.getName() + " получил пистолет:");
        shooter1.shoot();

        shooter2.setWeapon(null);
        System.out.println("\n" + shooter2.getName() + " потерял оружие:");
        shooter2.shoot();



        // Задание 6 Сравнение точек
        System.out.println("\nСравнение точек\n");

        Point p1 = new Point(3, 5);
        Point p2 = new Point(3, 5);
        Point p3 = new Point(7, 8);

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("p3 = " + p3);

        System.out.println("\np1.equals(p2): " + p1.equals(p2));  // true
        System.out.println("p1.equals(p3): " + p1.equals(p3));    // false
        System.out.println("p1.equals(null): " + p1.equals(null)); // false
    }

    private static int readInt(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Неверный ввод. Введите целое число: ");
            }
        }
    }

    public static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод данных. Введите целое число.");
            }
        }
    }
}
