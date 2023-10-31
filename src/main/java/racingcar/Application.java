package racingcar;

import racingcar.controller.TotalScore;
import racingcar.model.Car;
import racingcar.model.TryCount;
import racingcar.view.ResultView;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Car car = new Car("pobi,woni,jun");
        List<String> carNames = car.input();

        TryCount tryCount = new TryCount();
        int count = tryCount.count();

        for (int i=0; i<count; i++) {
            for (String name : carNames) {
                car = new Car(name);
                car.CarPlay();
            }
            System.out.println();

        }
    }
}
