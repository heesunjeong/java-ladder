package nextstep.ladder.controller;

import nextstep.ladder.domain.Ladder;
import nextstep.ladder.view.InputView;

public class LadderMain {
    public static void main(String[] args) {

        String names = InputView.inputPlayers();
        Ladder ladder = new Ladder(names);
    }
}
