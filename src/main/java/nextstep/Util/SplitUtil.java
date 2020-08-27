package nextstep.Util;

import java.util.Arrays;
import java.util.List;

public class SplitUtil {
    private static final String DEFAULT_SPLIT_DELIMITER = ",";

    public static List<String> splitString(String value) {
        return Arrays.asList(value.split(DEFAULT_SPLIT_DELIMITER));
    }
}
