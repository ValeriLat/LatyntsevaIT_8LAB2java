public class Employee2 {
    private String name;
    private Department2 department;

    public Employee2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Department2 getDepartment() {
        return department;
    }

    public void setDepartment(Department2 department) {
        this.department = department;
        if (department != null) {
            department.addEmployee(this);
        }
    }

    public boolean isBoss() {
        return department != null && department.getBoss() == this;
    }

    public Employee2[] getColleagues() {
        if (department == null) {
            return new Employee2[0]; // пустой массив
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
