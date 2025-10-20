public class Employee {
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
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBoss() {
        return department != null && department.getBoss() == this;
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
