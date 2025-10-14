package racingcar.util;

// 0~9 랜덤값 생성
public class RandomUtils {
    public static int getRandomNumber() {
        return (int) (Math.random() * 10);
    }
}
