package nextstep.ladder.view;

import java.util.List;

public class OutputView {

    public static final String RESULT_PRINT_MESSAGE = "\n실행결과\n";

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
            StringBuilder sb = new StringBuilder("     |");

            for (Boolean point : line) {
                sb.append(point ? "-----|" : "     |");
            }

            System.out.println(sb);
        }
    }
}
