package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.view.constants.Notice;

public class InputView {
    public static String requestCarNames(){
        System.out.println(Notice.ASK_CAR_NAMES.getMessage());
        return Console.readLine();
    }

    public static String requestNumberOfTrials(){
        System.out.println(Notice.ASK_NUMBER_OF_TRIALS.getMessage());
        return Console.readLine();
    }

}
