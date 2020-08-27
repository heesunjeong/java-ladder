package nextstep.ladder.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PlayerTest {

    @Test
    void create() {
        Player player = new Player("joy");

        assertThat(player).isEqualTo(new Player("joy"));
    }

    @Test
    void create_invalidName() {
        assertThatThrownBy(() -> new Player("joyjeong"))
                .isInstanceOf(RuntimeException.class);
    }
}
