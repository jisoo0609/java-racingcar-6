package racingcar.controller;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.model.Car;

import java.util.ArrayList;
import java.util.List;

public class RandomValue {
    private List<Integer> randomList = new ArrayList<>();
    public List<Integer> random(List<String> car) {
        for (int i =0; i< car.size(); i++) {
            randomList.add(Randoms.pickNumberInRange(0, 9));
        }
        System.out.println("random: "+randomList);
        return randomList;
    }
}