package nextstep.ladder.controller;

import nextstep.ladder.domain.Ladder;
import nextstep.ladder.view.InputView;

public class LadderMain {
    public static void main(String[] args) {

        String names = InputView.inputPlayers();
        int height = InputView.inputHeight();

        Ladder ladder = new Ladder(names, height);
    }
}
