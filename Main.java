public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.3 и 4.5 работа с именами");

        //  Клеопатра (только личное имя)
        Name name1 = new Name("Клеопатра");

        //  Александр Сергеевич Пушкин (все три параметра)
        Name name2 = new Name("Александр", "Пушкин", "Сергеевич");

        //  Владимир Маяковский (личное имя и фамилия)
        Name name3 = new Name("Владимир", "Маяковский");

        //  Христофор Бонифатьевич (личное имя и фамилия)
        Name name4 = new Name("Христофор", "Бонифатьевич");

        System.out.println("1. " + name1);
        System.out.println("2. " + name2);
        System.out.println("3. " + name3);
        System.out.println("4. " + name4);

        System.out.println("\nЗадача 1.5 Работа с этажами домов.");

        House house1 = new House(1);
        House house5 = new House(5);
        House house23 = new House(23);

        System.out.println(house1);
        System.out.println(house5);
        System.out.println(house23);

        System.out.println("\n=== Задача 2.4 Сотрудники и отделы ===\n");

        Employee petrov = new Employee("Петров");
        Employee kozlov = new Employee("Козлов");
        Employee sidorov = new Employee("Сидоров");

        Department itDepartment = new Department("IT");

        petrov.setDepartment(itDepartment);
        kozlov.setDepartment(itDepartment);
        sidorov.setDepartment(itDepartment);

        itDepartment.setBoss(kozlov);

        System.out.println("1. " + petrov);
        System.out.println("2. " + kozlov);
        System.out.println("3. " + sidorov);

        System.out.println("\nСписок сотрудников отдела IT (через Петрова):");
        Employee[] colleagues = petrov.getColleagues();
        for (int i = 0; i < colleagues.length; i++) {
            System.out.println(" - " + colleagues[i].getName());
        }

        System.out.println("\nСписок сотрудников отдела IT (через Козлова):");
        Employee[] colleagues2 = kozlov.getColleagues();
        for (int i = 0; i < colleagues2.length; i++) {
            System.out.println(" - " + colleagues2[i].getName());
        }

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