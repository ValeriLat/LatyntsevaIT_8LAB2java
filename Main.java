public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.3  работа с именами");

        Name name1 = new Name("Клеопатра");
        Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
        Name name3 = new Name("Маяковский", "Владимир");

        System.out.println("1. " + name1);
        System.out.println("2. " + name2);
        System.out.println("3. " + name3);

        System.out.println("\nЗадача 1.5 Работа с этажами домов.");

        House house1 = new House(1);
        House house5 = new House(5);
        House house23 = new House(23);

        System.out.println(house1);
        System.out.println(house5);
        System.out.println(house23);

        System.out.println("\nЗадача 2.4 Сотрудники и отделы");

        Employee petrov1 = new Employee("Петров");        // изменил имена
        Employee kozlov1 = new Employee("Козлов");        // изменил имена
        Employee sidorov1 = new Employee("Сидоров");      // изменил имена

        Department itDepartment1 = new Department("IT");  // изменил имя

        petrov1.setDepartment(itDepartment1);
        kozlov1.setDepartment(itDepartment1);
        sidorov1.setDepartment(itDepartment1);

        itDepartment1.setBoss(kozlov1);

        System.out.println("1. " + petrov1);
        System.out.println("2. " + kozlov1);
        System.out.println("3. " + sidorov1);

        System.out.println("\nЗадача 3.4 Сотрудники и отделы");

        Employee2 petrov2 = new Employee2("Петров");      // изменил имена
        Employee2 kozlov2 = new Employee2("Козлов");      // изменил имена
        Employee2 sidorov2 = new Employee2("Сидоров");    // изменил имена

        Department2 itDepartment2 = new Department2("IT"); // изменил имя

        petrov2.setDepartment(itDepartment2);
        kozlov2.setDepartment(itDepartment2);
        sidorov2.setDepartment(itDepartment2);

        itDepartment2.setBoss(kozlov2);

        System.out.println("1. " + petrov2);
        System.out.println("2. " + kozlov2);
        System.out.println("3. " + sidorov2);

        System.out.println("\nСписок сотрудников отдела IT (через Петрова):");
        Employee2[] colleagues = petrov2.getColleagues();
        for (int i = 0; i < colleagues.length; i++) {
            System.out.println(" - " + colleagues[i].getName());
        }

        System.out.println("\nСписок сотрудников отдела IT (через Козлова):");
        Employee2[] colleagues2 = kozlov2.getColleagues();
        for (int i = 0; i < colleagues2.length; i++) {
            System.out.println(" - " + colleagues2[i].getName());
        }

        System.out.println("\nЗадача 4.5 Работа с именами.");

        PersonName name12 = new PersonName("Клеопатра");
        PersonName name23 = new PersonName("Александр", "Пушкин", "Сергеевич");
        PersonName name34 = new PersonName("Владимир", "Маяковский");
        PersonName name45 = new PersonName("Христофор", "Бонифатьевич");

        System.out.println("1. " + name12);
        System.out.println("2. " + name23);
        System.out.println("3. " + name34);
        System.out.println("4. " + name45);

        System.out.println("\nЗадача 5.5 Работа с дробями.");

        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 3);
        Fraction f3 = new Fraction(3, 4);
        Fraction f4 = new Fraction(5, 6);

        System.out.println("Созданные дроби:");
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println("f4 = " + f4);

        System.out.println("\nПримеры операций:");

        // Сложение дробей
        Fraction sumResult = f1.add(f2);
        System.out.println(f1 + " + " + f2 + " = " + sumResult);

        // Вычитание дробей
        Fraction minusResult = f3.minus(f4);
        System.out.println(f3 + " - " + f4 + " = " + minusResult);

        // Умножение дробей
        Fraction multiplyResult = f1.multiply(f2);
        System.out.println(f1 + " * " + f2 + " = " + multiplyResult);

        // Деление дробей
        Fraction divResult = f3.div(f4);
        System.out.println(f3 + " / " + f4 + " = " + divResult);

        System.out.println("\nФорматированный вывод:");
        System.out.println(f1 + " + " + f2 + " = " + f1.add(f2));
        System.out.println(f3 + " - " + f4 + " = " + f3.minus(f4));
        System.out.println(f1 + " * " + f2 + " = " + f1.multiply(f2));
        System.out.println(f3 + " / " + f4 + " = " + f3.div(f4));

        System.out.println("\nЦепочка операций: f1.add(f2).div(f3).minus(5)");
        Fraction chainResult = f1.add(f2).div(f3).minus(5);
        System.out.println(f1 + " + " + f2 + " = " + f1.add(f2));
        System.out.println(f1.add(f2) + " / " + f3 + " = " + f1.add(f2).div(f3));
        System.out.println(f1.add(f2).div(f3) + " - 5 = " + chainResult);

        System.out.println("\nИтоговый результат цепочки: " + chainResult);
    }
}