package racingcar.util;

import camp.nextstep.edu.missionutils.Randoms;

// 0~9 랜덤값 생성
public class RandomUtils {
    public static int getRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
