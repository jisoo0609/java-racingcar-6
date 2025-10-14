package racingcar.domain;

import racingcar.util.RandomUtils;

import java.util.List;
import java.util.stream.Collectors;

// 자동차들을 관리하고 라운드 실행
public class RacingGame {
    private final List<Car> cars;
    private final int tryCount;

    public RacingGame(List<Car> cars, int tryConut) {
        validateCars(cars);

        validateTryCount(tryConut);

        this.cars = cars;
        this.tryCount = tryConut;
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

    // 전체 경기 실행
    public void play() {
        System.out.println("실행 결과");

        for (int i = 0; i < tryCount; i++) {
            playRound();
            for (Car car : cars) {
               System.out.println(car);
            }
            System.out.println();
        }
    }

    // 한 라운드 실행
    public void playRound() {
        for (Car car : cars) {
            int randomNumber = RandomUtils.getRandomNumber();
            car.move(randomNumber);
        }
    }

    // 우승자 리스트 반환
    public List<Car> getWinners() {
        int max = cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);

        return cars.stream()
                .filter(car -> car.getPosition() == max)
                .collect(Collectors.toList());
    }

    public String getWinnersName() {
        return getWinners().stream()
                .map(Car::getName)
                .collect(Collectors.joining(","));
    }

}
