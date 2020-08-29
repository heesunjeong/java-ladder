package nextstep.ladder.domain;

import nextstep.Util.SplitUtil;
import nextstep.ladder.strategy.RandomPointGenerator;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class LadderGame {

    private final List<Player> players;
    private final Ladder ladder;

    public LadderGame(String names, int height) {
        validate(names, height);

        this.players = getNameToPlayer(names);
        this.ladder = new Ladder(players.size(), height, new RandomPointGenerator());
    }

    private void validate(String names, int height) {
        if (names.isEmpty()) {
            throw new IllegalArgumentException("참여할 사람이 없습니다.");
        }

        if (height == 0) {
            throw new IllegalArgumentException("사다리 높이는 1 이상이어야 합니다.");
        }
    }

    public List<String> getPlayersName() {
        return players.stream()
                .map(Player::getName)
                .collect(Collectors.toList());
    }

    public Boolean[][] getLadder() {
        return ladder.getLadder();
    }

    private List<Player> getNameToPlayer(String playerNames) {
        List<String> players = SplitUtil.splitString(playerNames);
        return players.stream()
                .map(Player::new)
                .collect(Collectors.toList());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LadderGame ladderGame = (LadderGame) o;
        return Objects.equals(players, ladderGame.players);
    }

    @Override
    public int hashCode() {
        return Objects.hash(players);
    }

}
