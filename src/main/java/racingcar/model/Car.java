package racingcar.model;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;


public class Car {
    private String name;
    private int position = 0;
    private List<String> carName = new ArrayList<>();
    public Car(String name) {
        this.name = name;
    }
    public void CarPlay(){
        RandomNum();
        PrintPosition();
    }

    public String getName(){
        return this.name;
    }

    public int getPosition(){
        return this.position;
    }

    public void RandomNum(){
        int num = Randoms.pickNumberInRange(0,9);
        if(num >= 4){
            position ++;
        }
    }

    public void PrintPosition(){
        System.out.print(name + " : ");
        for(int i=0; i<position; i++){
            System.out.print("-");
        }
        System.out.println();
    }

    public List<String> input() { // 사용자에게 자동차 이름 입력받아 저장
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

        String inputCarName = Console.readLine();
        String[] splitCarName = inputCarName.split(",");

        for (int i = 0; i < splitCarName.length; i++) {
            if (splitCarName[i].length() > 5) {
                throw new IllegalArgumentException();
            }
            carName.add(splitCarName[i]);
        }
        return carName;
    }
}


