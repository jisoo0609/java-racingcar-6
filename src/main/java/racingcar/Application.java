package racingcar;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Car;
import racingcar.domain.RacingGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        // 1. 자동차 이름 입력
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,)로 구분)");
        String nameInput = Console.readLine();

        String[] carNames = nameInput.split(",");
        List<Car> cars = new ArrayList<>();

        for (String name : carNames) {
            String trimmedName = name.trim();

            if (!trimmedName.isEmpty()) {
                throw new IllegalArgumentException("자동차 이름은 비워둘 수 없습니다.");
            }
            cars.add(new Car(trimmedName));
        }

        // 2. 시도 횟수 입력
        System.out.println("시도할 회수는 몇 회인가요?");
        int tryCount = Integer.parseInt(Console.readLine());

        // 3. 게임 실행


        // 4. 최종 우승자 출력
    }
}