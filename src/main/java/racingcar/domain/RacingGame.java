package racingcar.domain;

import java.util.List;

// 자동차들을 관리하고 라운드 실행
public class RacingGame {
    private final List<Car> cars;
    private final int tryConut;

    public RacingGame(List<Car> cars, int tryConut) {
        // 검증 validate

        this.cars = cars;
        this.tryConut = tryConut;
    }

}
