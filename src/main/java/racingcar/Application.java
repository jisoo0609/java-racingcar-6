package racingcar;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Car;
import racingcar.domain.RacingGame;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // 1. 자동차 이름 입력
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,)로 구분)");
        List<Car> cars = createCars(Console.readLine());

        // 2. 시도 횟수 입력
        System.out.println("시도할 회수는 몇 회인가요?");
        int tryCount = Integer.parseInt(Console.readLine());

        // 3. 게임 실행
        RacingGame racingGame = new RacingGame(cars, tryCount);
        racingGame.play();

        // 4. 최종 우승자 출력
        System.out.println("최종 우승자 : " + racingGame.getWinnersName());

        Console.close();
    }

    /**
     * 주어진 이름 배열로 자동차 리스트를 생성합니다.
     * 이름이 비어있거나 5자를 초과하면 예외를 던집니다.
     *
     * @param input
     * @return 자동차 리스트
     * @throws IllegalArgumentException 이름이 유효하지 않을 경우
     */
    private static List<Car> createCars(String input) {
        String[] names = input.split(",");
        List<Car> cars = new ArrayList<>();

        for (String name : names) {
            String trimmedName = name.trim();
            if (trimmedName.isEmpty()) {
                throw new IllegalArgumentException("자동차 이름은 비워둘 수 없습니다.");
            }
            cars.add(new Car(trimmedName));
        }
        return cars;
    }
}