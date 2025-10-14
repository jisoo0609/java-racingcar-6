package racingcar.domain;

// 자동차 객체
public class Car {
    private final String name;
    private int positon = 0;

    public Car(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (name == null || name.isBlank() || name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 1~5자여야 합니다.");
        }
    }


}
