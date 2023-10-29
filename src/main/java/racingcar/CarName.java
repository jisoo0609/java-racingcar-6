package racingcar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CarName {
    public String inputCarName;
    List<String> carName = new ArrayList<>();

    public List<String> input() { // 사용자에게 자동차 이름 입력받아 저장
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

        try {
            inputCarName = br.readLine();
            String[] splitCarName = inputCarName.split(",");
            for (int i = 0; i < splitCarName.length; i++) {
                if (splitCarName[i].length() > 5) {
                    throw new IllegalArgumentException();
                }
                carName.add(splitCarName[i]);
            }

        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
        return carName;
    }
}


