package nextstep.ladder.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LadderGameTest {

    @Test
    void create() {
        String playerNames = "pobi,honux,crong,jk";

        LadderGame ladderGame = new LadderGame(playerNames, 1);

        assertThat(ladderGame).isEqualTo(new LadderGame(playerNames, 1));
    }

    @Test
    void create_invalid() {
        assertThatThrownBy(() -> new LadderGame("pobi,honux,crong,jk", 0)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new LadderGame("", 5)).isInstanceOf(IllegalArgumentException.class);
    }
}
