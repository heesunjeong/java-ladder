package nextstep.ladder.domain;

import nextstep.Util.SplitUtil;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Ladder {

    private final List<Player> players;
    private final int height;

    public Ladder(String names, int height) {
        validate(names, height);

        this.players = getPlayers(names);
        this.height = height;
    }

    private void validate(String names, int height) {
        if (names.isEmpty()) {
            throw new IllegalArgumentException("참여할 사람이 없습니다.");
        }

        if (height == 0) {
            throw new IllegalArgumentException("사다리 높이는 1 이상이어야합니다.");
        }
    }

    private List<Player> getPlayers(String playerNames) {
        List<String> players = SplitUtil.splitString(playerNames);
        return players.stream()
                .map(Player::new)
                .collect(Collectors.toList());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ladder ladder = (Ladder) o;
        return Objects.equals(players, ladder.players);
    }

    @Override
    public int hashCode() {
        return Objects.hash(players);
    }
}
