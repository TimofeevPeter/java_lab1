public class lab2 {
    public static void main(String[] args) {
        System.out.println("№1. Задача 4.");

        System.out.println("Текстовый формат для 10 секунд:");
        Time s1 = new Time(10);
        System.out.println(s1.toString());

        System.out.println("Текстовый формат для 10000 секунд:");
        Time s2 = new Time(10000);
        System.out.println(s2.toString());

        System.out.println("Текстовый формат для 100000 секунд:");
        Time s3 = new Time(100000);
        System.out.println(s3.toString());

        System.out.println("");
        System.out.println("№1. Задача 5.");

        Home f1 = new Home(1);
        System.out.println(f1.toString());

        Home f2 = new Home(5);
        System.out.println(f2.toString());

        Home f3 = new Home(23);
        System.out.println(f3.toString());

        System.out.println("");
        System.out.println("№2. Задача 4.");

        Department it = new Department("IT");

        Employee petrov = new Employee("Петров");
        Employee koslov = new Employee("Козлов");
        Employee sidorov = new Employee("Сидоров");

        petrov.setDepartment(it);
        koslov.setDepartment(it);
        sidorov.setDepartment(it);

        it.setBoss(koslov);

        System.out.println(petrov.toString());
        System.out.println(koslov.toString());
        System.out.println(sidorov.toString());
        System.out.println("");

        System.out.println("№3. Задача 4.");
        System.out.println("Все сотрудники отдела Петрова: ");
        for (Employee emp : petrov.getDepartmentEmployees()) {
            System.out.println("- " + emp.getName());
        }

        System.out.println("");
        System.out.println("№4. Задача 3.");

        Home f4 = new Home(2);
        Home f5 = new Home(35);
        Home f6 = new Home(91);

        // Демонстрация невозможности изменения:
        // h4.floors = 10;          // ошибка: поле private, извне недоступно
        // floors = 10;             // ошибка: поле final, переназначить нельзя

        System.out.println(f4.toString());
        System.out.println(f5.toString());
        System.out.println(f6.toString());

        System.out.println("");
        System.out.println("№5. Задача 1.");

        Gun gun = new Gun(3);
        for (int i = 0; i < 5; i++) {
            gun.shoot();
        }
    }
}