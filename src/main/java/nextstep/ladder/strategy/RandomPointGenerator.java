package nextstep.ladder.strategy;

import java.util.Random;

public class RandomPointGenerator implements PointGenerator {

    @Override
    public boolean generate() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
