package racingcar.domain;

import racingcar.dto.CarPosition;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move() {
        position++;
    }

    public CarPosition buildCarPosition() {
        return new CarPosition(name, position);
    }

}
