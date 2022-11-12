package bowling;

import bowling.domain.BowlingGame;
import bowling.domain.UserName;
import bowling.ui.InputView;
import bowling.ui.ResultView;

import java.util.ArrayList;

public class BowlingMain {
    public static void main(String[] args) {
        String inputUserName = InputView.inputPlayerName();
        UserName userName = new UserName(inputUserName);
        ResultView.printScoreBoard(userName, new ArrayList<>());
        BowlingGame bowlingGame = new BowlingGame();
        bowlingGame.play(userName);
    }
}
