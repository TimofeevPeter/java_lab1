package ru.timofeev.home;

public class Home {

    private final int floor;

    public Home(int floor) {
        if (floor <= 0) {
            throw new IllegalArgumentException("Количество этажей должно быть больше 0.");
        }
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
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

