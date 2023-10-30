package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;

public class TryCount {
    private String inputCount;
    private int count;

    public int count() { // 시도할 회수 입력
        System.out.println("시도할 회수는 몇회인가요?");
        inputCount = Console.readLine();
        try {
            count = Integer.parseInt(inputCount);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
        return count;
    }

}