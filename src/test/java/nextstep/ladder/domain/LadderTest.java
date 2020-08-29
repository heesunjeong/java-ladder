package nextstep.ladder.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LadderTest {

    @Test
    void create() {
        Ladder ladder = new Ladder(4, 5, () -> false);

        assertThat(ladder).isEqualTo(new Ladder(4, 5, () -> false));
    }
}
