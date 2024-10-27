package racingcar.controller;

import java.util.ArrayList;
import racingcar.domain.Cars;
import racingcar.domain.Parser;
import racingcar.validator.CarNamesValidator;
import racingcar.validator.TotalRoundsValidator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Game {

    public void run(){
        String rawCarNames = InputView.requestCarNames();
        ArrayList<String> carNames = Parser.parse(rawCarNames);
        CarNamesValidator.validate(carNames);
        Cars cars = new Cars(carNames);

        String rawTotalRounds = InputView.requestTotalRounds();
        TotalRoundsValidator.validate(rawTotalRounds);
        int totalRounds = Integer.parseInt(rawTotalRounds);

        proceedRacing(cars, totalRounds);
        OutputView.printWinner(cars.getWinner());
    }

    public void proceedRacing(Cars cars , int totalRounds ) {
        OutputView.printProcessResult();

        for (int i = 0; i < totalRounds; i++) {
            cars.proceedOneRound();
            ArrayList<String> currentStates = cars.getCurrentStates();
            OutputView.printRoundResult(currentStates);
        }
    }

}
