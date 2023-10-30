package racingcar.controller;

import racingcar.model.Car;

import java.util.ArrayList;
import java.util.List;

public class Score { //count만큼 시행했을때 누가 가장 많이 갔는지 결정
    private List<Integer> score = new ArrayList<>();

    public List<Integer> point(List<String> car) {
        RandomValue randomValue = new RandomValue();
        List<Integer> random = randomValue.random(car);

        for (int i = 0; i < random.size(); i++) { // score 크기 random과 같게 초기화
            score.add(0);
        }

        for (int i=0; i<random.size(); i++) {
            if (random.get(i) >=4 ) {
                score.set(i, 1);
            }
        }

        System.out.println("random이 4 이상인 경우: "+ score);

        return score;
    }
}
