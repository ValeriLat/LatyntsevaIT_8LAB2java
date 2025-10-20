public class House {
    private int floors;

    public House(int floors) {
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

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
