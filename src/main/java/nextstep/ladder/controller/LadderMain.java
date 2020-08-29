package nextstep.ladder.controller;

import nextstep.ladder.domain.LadderGame;
import nextstep.ladder.view.InputView;
import nextstep.ladder.view.OutputView;

public class LadderMain {
    public static void main(String[] args) {

        String names = InputView.inputPlayers();
        int height = InputView.inputHeight();

        LadderGame ladderGame = new LadderGame(names, height);

        OutputView.printResultMessage();
        OutputView.printPlayerName(ladderGame.getPlayersName());
        OutputView.printLadder(ladderGame.getLadder());
    }
}
