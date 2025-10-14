# 자동차 경주 게임
## 프로젝트 구조
```
racingcar/
├─ Application.java           // main() 실행 진입점
├─ domain/
│   ├─ Car.java               // 자동차 객체
│   └─ RacingGame.java        // 자동차들을 관리하고 라운드 실행
├─ util/
│   └─ RandomUtils.java       // 0~9 랜덤값 생성
├─ view/
│   ├─ InputView.java         // 사용자 입력 처리
│   └─ ResultView.java        // 게임 결과 출력
└─ exception/
└─ InvalidInputException.java  // 사용자 입력 검증용 예외
```
## 개발 단계
### 1. 요구사항 분석 정리
- 자동차 이름 입력 (쉼표로 구분, 각 5자 이하)
- 이동 횟수 입력 (양의 정수)
- 0~9 랜덤값 → 4 이상이면 전진
- 모든 라운드 출력 → 최종 우승자 출력
- 잘못된 입력 시 IllegalArgumentException 발생 후 종료
### 2. 도메인 모델 설계
🧩 `Car.java`
- 필드: String name, int position 
- 메서드:
```java
move(int randomNumber)

getPosition(), getName()

toString() → "pobi : ---" 이런 식으로 표시
```

🧩 `RacingGame.java`
- 필드: List<Car> cars, int tryCount 
- 메서드:
```java
playRound() → 한 라운드 실행

play() → 전체 경기 실행

getWinners() → 우승자 리스트 반환
```
### 3. 유틸리티 작성
🧩 `RandomUtils.java`
```java
public class RandomUtils {
    public static int getRandomNumber() {
    return (int) (Math.random() * 10);
    }
}
```
### 4. 입출력 뷰 작성
🧩 `InputView.java`

```java
public static String[] getCarNames()

public static int getTryCount()
```
🧩 `ResultView.java`
```java
printRoundResult(List<Car> cars)

printWinners(List<Car> winners)
```
### 5. 메인 로직 연결
🧩 `Application.java`
```java
public class Application {
    public static void main(String[] args) {
    String[] names = InputView.getCarNames();
    int count = InputView.getTryCount();
    
            RacingGame game = new RacingGame(names, count);
            game.play();
    
            ResultView.printWinners(game.getWinners());
        }
    }
```

### 6. 입력 검증 + 예외 처리
- 자동차 이름이 5자 초과 → 예외 발생
- 중복 이름 → 예외 발생 
- 이동 횟수가 숫자가 아님 → 예외 발생
```java
if (name.length() > 5) {
    throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
}
```

### 7. 출력 형식 통일
예시:
```
경주할 자동차 이름을 입력하세요. (이름은 쉼표(,)로 구분)

pobi,woni,jun
시도할 회수는 몇 회인가요?
5
실행 결과
pobi : --
woni : -
jun : ---
최종 우승자 : jun
```
### 8. 테스트 점검
- `Car.move()` `→ 4 이상일 때만 전진하는지
- `RacingGame.getWinners()` → 여러 명이 같은 거리일 때 쉼표 구분 출력하는지
- 입력 검증 → 잘못된 입력 시 예외 발생하는지
