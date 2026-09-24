public class Home {

    private final int floor;

    public Home(int floor) {

        this.floor = floor;
    }

    @Override
    public String toString() {
        if ((floor % 10) == 1 && floor != 11) {
            return "Дом с " + floor + " этажом";
        } else {
            return "Дом с " + floor + " этажами";
        }
    }
}