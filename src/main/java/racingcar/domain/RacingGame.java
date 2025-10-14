package racingcar.domain;

import java.util.List;

// 자동차들을 관리하고 라운드 실행
public class RacingGame {
    private final List<Car> cars;
    private final int tryConut;

    public RacingGame(List<Car> cars, int tryConut) {
        validateCars(cars);
        validateTryCount(tryConut);

        this.cars = cars;
        this.tryConut = tryConut;
    }

    private void validateCars(List<Car> cars) {
        if (cars.isEmpty()) {
            throw new IllegalArgumentException("자동차가 최소 1대 이상이어야 합니다.");
        }
    }

    private void validateTryCount(int tryConut) {
        if (tryConut <= 0) {
            throw new IllegalArgumentException("시도 횟수는 1번 이상이여야 합니다.");
        }
    }


}
