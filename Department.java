public class Department {
    private String name;
    private Employee boss;

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

    public void setName(String name) {
        this.name = name;
    }
}
