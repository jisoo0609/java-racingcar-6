package racingcar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCount {
    public int count;
    public int count() { // 시도할 회수 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("시도할 회수는 몇회인가요?");
        try {
            count = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
        return count;
    }

}
