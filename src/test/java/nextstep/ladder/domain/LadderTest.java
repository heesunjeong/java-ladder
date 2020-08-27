package nextstep.ladder.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LadderTest {

    @Test
    void create() {
        String playerNames = "pobi,honux,crong,jk";

        Ladder ladder = new Ladder(playerNames);

        assertThat(ladder).isEqualTo(new Ladder(playerNames));
    }
}
