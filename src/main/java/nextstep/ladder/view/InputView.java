package nextstep.ladder.view;

import java.util.Scanner;

public class InputView {

    private InputView(){
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static final String INPUT_PLAYER_NAMES_MESSAGE = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    public static final String INPUT_HEIGHT_MESSAGE = "최대 사다리 높이는 몇 개인가요?";

    public static String inputPlayers() {
        System.out.println(INPUT_PLAYER_NAMES_MESSAGE);
        return scanner.nextLine();
    }

    public static int inputHeight() {
        System.out.println(INPUT_HEIGHT_MESSAGE);
        return scanner.nextInt();
    }
}
