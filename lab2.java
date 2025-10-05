// задание 1.3 и 4.5
class Name {
    private String familia;
    private String im;
    private String otchestvo;

    public Name() {
    }

    // Конструктор только с личным именем
    public Name(String im) {
        this.im = im;
    }

    // Конструктор с личным именем и фамилией
    public Name(String im, String familia) {
        this.im = im;
        this.familia = familia;
    }

    // Конструктор со всеми тремя параметрами
    public Name(String im, String familia, String otchestvo) {
        this.im = im;
        this.familia = familia;
        this.otchestvo = otchestvo;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        //  имя
        if (im != null) {
            result.append(im);
        }

        //  фамилию (если есть)
        if (familia != null) {
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(familia);
        }

        //  отчество (если есть)
        if (otchestvo != null) {
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(otchestvo);
        }



        return result.toString();
    }
}

// задание 1.5
class House {
    private int floors;

    // конструктор
    public House(int floors) {
        this.floors = floors;
    }

    // метод для определения правильного окончания
    private String getFloorEnding() {
        int lastDigit = floors % 10;
        int lastTwoDigits = floors % 100;

        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            return "этажами";
        }

        switch (lastDigit) {
            case 1:
                return "этажом";
            case 2:
            case 3:
            case 4:
                return "этажами";
            default:
                return "этажами";
        }
    }

    @Override
    public String toString() {
        return "дом с " + floors + " " + getFloorEnding();
    }
}

// задание 2.4 и 3.4
class Department {
    private String name;
    private Employee boss;
    private Employee[] employees = new Employee[10];
    private int employeeCount = 0;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Employee getBoss() {
        return boss;
    }

    public void setBoss(Employee boss) {
        this.boss = boss;
    }

    public Employee[] getEmployees() {
        Employee[] result = new Employee[employeeCount];
        for (int i = 0; i < employeeCount; i++) {
            result[i] = employees[i];
        }
        return result;
    }

    public void addEmployee(Employee employee) {
        if (employeeCount < employees.length) {
            employees[employeeCount] = employee;
            employeeCount++;
        }
    }
}

class Employee {
    private String name;
    private Department department;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
        if (department != null) {
            department.addEmployee(this);
        }
    }

    public boolean isBoss() {
        return department != null && department.getBoss() == this;
    }

    public Employee[] getColleagues() {
        if (department == null) {
            return new Employee[0]; // пустой массив
        }
        return department.getEmployees();
    }

    @Override
    public String toString() {
        if (department == null) {
            return name;
        }

        if (isBoss()) {
            return name + " начальник отдела " + department.getName();
        } else {
            String bossName = department.getBoss() != null ? department.getBoss().getName() : "не назначен";
            return name + " работает в отделе " + department.getName() + ", начальник которого " + bossName;
        }
    }
}

// задание 5.5
class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    // Конструктор для целого числа
    public Fraction(int number) {
        this.numerator = number;
        this.denominator = 1;
    }

    // Нахождение НОД
    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Упрощение дроби
    private void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

        // Убедимся, что знаменательположительный
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    // Сложение с другой дробью
    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Сложение с целым числом
    public Fraction add(int number) {
        return this.add(new Fraction(number));
    }

    // Вычитание другой дроби
    public Fraction minus(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Вычитание целого числа
    public Fraction minus(int number) {
        return this.minus(new Fraction(number));
    }

    // Умножение на другую дробь
    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Умножение на целое число
    public Fraction multiply(int number) {
        return this.multiply(new Fraction(number));
    }

    // Деление на другую дробь
    public Fraction div(Fraction other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Деление на ноль");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Деление на целое число
    public Fraction div(int number) {
        return this.div(new Fraction(number));
    }

    @Override
    public String toString() {
        if (denominator == 1) {
            return String.valueOf(numerator);
        }
        return numerator + "/" + denominator;
    }
}