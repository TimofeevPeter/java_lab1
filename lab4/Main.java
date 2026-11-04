import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.3. Сравнимое\n");

        //Пример 1: сравнение чисел
        СравнимоеЧисло a = new СравнимоеЧисло(10);
        СравнимоеЧисло b = new СравнимоеЧисло(20);
        СравнимоеЧисло c = new СравнимоеЧисло(10);

        System.out.println("Сравниваем первое число со вторым: если отрицательное число - меньше, " +
                "положительное - больше, ноль - числа равны");

        int result1 = a.сравнить(b.getValue());
        int result2 = b.сравнить(a.getValue());
        int result3 = c.сравнить(a.getValue());

        System.out.println(a +  " и " + b + ": "  + result1);
        System.out.println(b +  " и " + a + ": "  + result2);
        System.out.println(a +  " и " + c + ": "  + result3 + "\n");

        //Пример 2: сравнение длин строк
        System.out.println("Сравниваем длины строк:");

        СравнимаяСтрока a_t = new СравнимаяСтрока("Менетил");
        СравнимаяСтрока b_t = new СравнимаяСтрока("hi");
        СравнимаяСтрока c_t = new СравнимаяСтрока("1234567");

        int result1_t = a_t.сравнить(b_t.getText());
        int result2_t = b_t.сравнить(a_t.getText());
        int result3_t = c_t.сравнить(a_t.getText());

        System.out.println(a_t + " и " + b_t + ": " + result1_t);
        System.out.println(b_t + " и " + a_t + ": " + result2_t);
        System.out.println(a_t + " и " + c_t + ": " + result3_t + "\n");

        System.out.println("Задача 1.6. Обобщённый неизменяемый массив. \n");

        //Пример 1: список целых чисел
        ImmutableValueList<Integer> intList = new ImmutableValueList<>(
                Integer.class, 10, 20, 30, 40, 50
        );
        System.out.println("Создан: " + intList);
        System.out.println("Размер: " + intList.size());
        System.out.println("Элемент [2]: " + intList.get(2));

        intList.set(2, 99);
        System.out.println("После замены [2]=99: " + intList);

        //Пример 2: список строк
        System.out.println("\nСписок строк:");
        ImmutableValueList<String> strList = new ImmutableValueList<>(String.class, "Привет", "586", "Java");
        System.out.println("Создан: " + strList);
        System.out.println("Размер: " + strList.size());
        System.out.println("Элемент [0]: " + strList.get(0));

        //Пример 3: список дробных чисел
        System.out.println("\nСписок дробных чисел:");
        ImmutableValueList<Double> doubleList = new ImmutableValueList<>(
                Double.class, 3.14, 2.71, 1.41
        );
        System.out.println("Создан: " + doubleList);
        System.out.println("Пуст? " + doubleList.isEmpty());

        //Пример 4: демонстрация неизменяемости структуры
        System.out.println("\nДемонстрация независимости копий:");
        ImmutableValueList<Integer> original = new ImmutableValueList<>(
                Integer.class, 1, 2, 3
        );
        ImmutableValueList<Integer> copy = new ImmutableValueList<>(original);

        copy.set(0, 999);
        System.out.println("Оригинал: " + original);  // [1, 2, 3]
        System.out.println("Копия: " + copy);          // [999, 2, 3]

        //ример 5: проверка границ
        System.out.println("\nПроверка границ:");
        try {
            intList.get(666);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Задача 2.4: Заполнение списка
        System.out.println("\nЗадача 2.4. Заполнение списка\n");

        List<Integer> intList_1 = new ArrayList<>();
        ListFiller.completionList(intList_1);
        System.out.println("List<Integer>: размер = " + intList_1.size()
                + ", первые 5: " + intList_1.subList(0, 5)
                + ", последние 5: " + intList_1.subList(95, 100));

        List<Number> numberList_1 = new ArrayList<>();
        ListFiller.completionList(numberList_1);
        System.out.println("\nList<Number>: размер = " + numberList_1.size()
                + ", первые 3: " + numberList_1.subList(0, 3));

        List<Object> objectList_1 = new ArrayList<>();
        ListFiller.completionList(objectList_1);
        System.out.println("\nList<Object>: размер = " + objectList_1.size()
                + ", первые 3: " + objectList_1.subList(0, 3));


        System.out.println("\n Задача 3.1.");

        //Пример 1: строки → длины
        System.out.println("1. Преобразование строк в длины:");
        List<String> strings = Arrays.asList("qwerty", "asdfg", "zx");
        System.out.println("Исходный список: " + strings);

        List<Integer> lengths = ListTrans.transform(
                strings,
                new StringToLength()
        );
        System.out.println("Результат: " + lengths);
        // Ожидаемый вывод: [6, 5, 2]

        //Пример 2: отрицательные → положительные
        System.out.println("\n2. Делание отрицательных чисел положительными:");
        List<Integer> numbers = Arrays.asList(1, -3, 7);
        System.out.println("Исходный список: " + numbers);

        List<Integer> positive = ListTrans.transform(
                numbers,
                new MakePositive()
        );
        System.out.println("Результат: " + positive);
        // Ожидаемый вывод: [1, 3, 7]

        //Пример 3: массивы → максимумы
        System.out.println("\n3. Нахождение максимума в каждом массиве:");
        List<int[]> arrays = new ArrayList<>();
        arrays.add(new int[]{1, 5, 3});
        arrays.add(new int[]{10, 2, 8, 4});
        arrays.add(new int[]{7, 7, 7});

        System.out.println("Исходные массивы:");
        for (int[] arr : arrays) {
            System.out.println(Arrays.toString(arr));
        }

        List<Integer> maxValues = ListTrans.transform(
                arrays,
                new ArrayMax()
        );
        System.out.println("Максимальные значения: " + maxValues);

        System.out.println("\nЗадача 3.2.\n");

        //Пример 1: строки длиной >= 3
        System.out.println("1. Фильтрация строк (длина >= 3):");
        System.out.println("Исходный список: " + strings);

        List<String> filteredStrings = ListFilter.filter(
                strings,
                new Length3()
        );
        System.out.println("Результат: " + filteredStrings);

        //Пример 2: положительные числа
        System.out.println("\n2. Фильтрация положительных чисел:");
        List<Integer> numbers_1 = Arrays.asList(1, -3, 7);
        System.out.println("Исходный список: " + numbers_1);

        List<Integer> positiveNumbers = ListFilter.filter(
                numbers_1,
                new IsPositive()
        );
        System.out.println("Результат: " + positiveNumbers);

        //Пример 3: массивы без положительных элементов
        System.out.println("\n3. Фильтрация массивов (нет положительных):");
        List<int[]> arrays_1 = new ArrayList<>();
        arrays_1.add(new int[]{-1, -2, -3});
        arrays_1.add(new int[]{1, 2, 3});
        arrays_1.add(new int[]{0, -5, 0});
        arrays_1.add(new int[]{-10, 0, -1});

        System.out.println("Исходные массивы:");
        for (int[] arr : arrays_1) {
            System.out.println("  " + Arrays.toString(arr));
        }

        List<int[]> filteredArrays = ListFilter.filter(
                arrays_1,
                new notPositive()
        );

        System.out.println("Результат (массивы без положительных):");
        for (int[] arr : filteredArrays) {
            System.out.println("  " + Arrays.toString(arr));
        }

        System.out.println("\nЗадача 3.3\n");

        // --- Пример 1: Cлияние строк ---
        System.out.println("1. Слияние строк:");
        System.out.println("Исходный список: " + strings);

        String concatenated = ListReducer.reduce(
                strings,
                "",
                new Concat()
        );
        System.out.println("Результат: \"" + concatenated + "\"");

        // --- Пример 2: сумма чисел ---
        System.out.println("\n2. Сумма чисел:");
        System.out.println("Исходный список: " + numbers);

        Integer sum = ListReducer.reduce(
                numbers,
                0,
                new Summa()
        );
        System.out.println("Результат: " + sum);
        System.out.println("\n3. Общее количество элементов в списке списков:");

        List<List<Integer>> groups = new ArrayList<>();
        groups.add(Arrays.asList(1, 2, 3));
        groups.add(Arrays.asList(10, 20));
        groups.add(Arrays.asList(100, 200, 300, 400));
        groups.add(Arrays.asList());

        System.out.println("Исходные группы:");
        for (List<Integer> group : groups) {
            System.out.println("  " + group + " (размер: " + group.size() + ")");
        }

        List<Integer> sizes = ListTrans.transform(
                groups,
                new ListSize()
        );
        System.out.println("\nРазмеры групп: " + sizes);
        Integer totalElements = ListReducer.reduce(
                sizes,
                0,
                new Summa()
        );
        System.out.println("Общее количество элементов: " + totalElements);

        //Пример 4: пустой список
        System.out.println("\n4. Пустой список:");
        List<Integer> emptyInt = new ArrayList<>();

        Integer emptySum = ListReducer.reduce(emptyInt, 0, new Summa());
        System.out.println("Сумма пустого списка: " + emptySum);  // 0, не null!

        List<String> emptyStr = new ArrayList<>();
        String emptyConcat = ListReducer.reduce(emptyStr, "", new Concat());
        System.out.println("Слияние пустого списка: \"" + emptyConcat + "\"");
    }
}