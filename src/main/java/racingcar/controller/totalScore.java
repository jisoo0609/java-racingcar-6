package racingcar.controller;

import java.util.ArrayList;
import java.util.List;

public class totalScore {
    private List<Integer> totalScore = new ArrayList<>();

    public List<Integer> playerScore(List<String> car, int count) {
        for (int i = 0; i < car.size(); i++) { // score 크기 random과 같게 초기화
            totalScore.add(0);
        }

        for (int i = 0; i < count; i++) {
            Score sco = new Score();
            List<Integer> score = sco.point(car);

            for (int j = 0; j < totalScore.size(); j++) {
                int currentScore = totalScore.get(j);
                int newScore = score.get(j);
                totalScore.set(j, currentScore + newScore);
            }
        }

        System.out.println("totalScore: "+totalScore);

        return totalScore;
    }
}
