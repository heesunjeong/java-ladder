package nextstep.ladder.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LadderTest {

    @Test
    void create() {
        String playerNames = "pobi,honux,crong,jk";

        Ladder ladder = new Ladder(playerNames, 1);

        assertThat(ladder).isEqualTo(new Ladder(playerNames, 1));
    }

    @Test
    void create_invalid() {
        assertThatThrownBy(() -> new Ladder("pobi,honux,crong,jk", 0)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Ladder("", 5)).isInstanceOf(IllegalArgumentException.class);

    }
}
