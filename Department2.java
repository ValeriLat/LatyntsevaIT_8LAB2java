public class Department2 {
    private String name;
    private Employee2 boss;
    private Employee2[] employees = new Employee2[10]; // массив вместо List
    private int employeeCount = 0; // счетчик сотрудников

    public Department2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Employee2 getBoss() {
        return boss;
    }

    public void setBoss(Employee2 boss) {
        this.boss = boss;
    }

    public Employee2[] getEmployees() {
        // Возвращаем массив только с реальными сотрудниками
        Employee2[] result = new Employee2[employeeCount];
        for (int i = 0; i < employeeCount; i++) {
            result[i] = employees[i];
        }
        return result;
    }

    public void addEmployee(Employee2 employee) {
        if (employeeCount < employees.length) {
            employees[employeeCount] = employee;
            employeeCount++;
        }
    }
}
