package nextstep.ladder.util;

import nextstep.Util.SplitUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SplitUtilTest {
    @Test
    void splitString() {
        String value = "joy,dave,jaden,dominic";

        List<String> result = SplitUtil.splitString(value);

        assertThat(result).hasSize(4).containsExactly("joy", "dave", "jaden", "dominic");
    }
}
