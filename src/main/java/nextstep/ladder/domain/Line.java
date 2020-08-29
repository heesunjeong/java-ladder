package nextstep.ladder.domain;

import nextstep.ladder.strategy.PointGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Line {
    private List<Boolean> points;

    public Line(int countOfPerson, PointGenerator pointGenerator) {
        this.points = makeLine(countOfPerson, pointGenerator);
    }

    private List<Boolean> makeLine(int countOfPerson, PointGenerator pointGenerator) {
        List<Boolean> points = new ArrayList<>();

        for (int i = 0; i < countOfPerson - 1; i++) {
            points.add(generatePoint(i, points, pointGenerator));
        }

        return points;
    }

    private Boolean generatePoint(int index, List<Boolean> points, PointGenerator pointGenerator) {
        if (index != 0 && Boolean.TRUE.equals(points.get(index - 1))) {
            return Boolean.FALSE;
        }

        return pointGenerator.generate();
    }

    public List<Boolean> getPoints() {
        return points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(points, line.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }
}
