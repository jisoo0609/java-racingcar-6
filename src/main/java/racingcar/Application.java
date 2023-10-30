package racingcar;

import racingcar.controller.Score;
import racingcar.controller.Winner;
import racingcar.model.Car;

import java.util.List;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        Car car = new Car();
        List<String> carName = car.input();

        Winner winner = new Winner();
        List<Integer> point = winner.playerScore(carName);

        System.out.println(point);

    }
}
