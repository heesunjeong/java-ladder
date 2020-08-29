package nextstep.ladder.domain;

import nextstep.ladder.strategy.PointGenerator;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ladder {
    private List<Line> lines;

    public Ladder(int countOfPerson, int height, PointGenerator pointGenerator) {
        this.lines = IntStream.range(0, height)
                .mapToObj(it -> new Line(countOfPerson, pointGenerator))
                .collect(Collectors.toList());
    }

    public Boolean[][] getLadder() {
        return lines.stream()
                .map(it -> it.getPoints().toArray(new Boolean[0]))
                .toArray(Boolean[][]::new);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ladder ladder = (Ladder) o;
        return Objects.equals(lines, ladder.lines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lines);
    }
}
