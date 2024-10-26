package racingcar.domain;

import java.util.ArrayList;

public class Cars {
    private ArrayList<Car> cars;

    public Cars(ArrayList<String> carNames) {
        this.cars = createCars(carNames);
    }

    public static Car createCar(String carName){
        return new Car(carName);
    }

    public ArrayList<Car> createCars(ArrayList<String> carNames){

        return new ArrayList<>
                (carNames.stream()
                        .map(Cars::createCar)
                        .toList());

    }

    public void proceedOneRound(){
        for (Car car : cars) {
            if (MovementDecider.checkMoveOrNot()){
                car.move();
            }
        }
    }

    public ArrayList<String> getCurrentStates(){
        ArrayList<String> currentStates = new ArrayList<>();
        for (Car car : cars) {
            currentStates.add(car.getCurrentState());
        }

        return currentStates;
    }
}
