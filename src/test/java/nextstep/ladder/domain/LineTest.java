package nextstep.ladder.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LineTest {

    @Test
    void create() {
        Line line = new Line(3, () -> false);

        assertThat(line).isEqualTo(new Line(3, () -> false));
    }
}
