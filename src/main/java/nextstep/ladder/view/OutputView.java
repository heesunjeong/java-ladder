package nextstep.ladder.view;

import java.util.List;

public class OutputView {

    public static final String RESULT_PRINT_MESSAGE = "\n실행결과\n";
    public static final String LADDER_LINE_EMPTY = "     |";
    public static final String LADDER_LINE_POINT = "-----|";

    private OutputView() {
    }

    public static void printResultMessage() {
        System.out.println(RESULT_PRINT_MESSAGE);
    }

    public static void printPlayerName(List<String> players) {
        players.forEach(it -> System.out.printf("%6s", it));
        System.out.println();
    }

    public static void printLadder(Boolean[][] ladder) {
        for (Boolean[] line : ladder) {
            printLadderLine(line);
        }
    }

    private static void printLadderLine(Boolean[] line) {
        StringBuilder sb = new StringBuilder(LADDER_LINE_EMPTY);

        for (Boolean point : line) {
            sb.append(point ? LADDER_LINE_POINT : LADDER_LINE_EMPTY);
        }

        System.out.println(sb);
    }
}
