package nextstep.ladder.domain;

import nextstep.Util.SplitUtil;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Ladder {

    private final List<Player> players;

    public Ladder(String playerNames) {
        this.players = getPlayers(playerNames);
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
