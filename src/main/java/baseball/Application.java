package baseball;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        Answer answer = new Answer();
        List<Integer> ans =answer.RandomAns();                  //랜덤 값 생성(Answer) 답은 ans에 List형식으로 저장

        System.out.println("숫자 야구 게임을 시작합니다.");         //처음에 시작할때 한번만
        Input input = new Input();

        List<Integer> inputnum=input.inputnum();               //입력값 받기(Input) 입력값은 inputnum에 List형식으로 저장

        //랜덤 값과 입력값을 비교하는 판단 알고리즘(Match)
        //알고리즘 후 나온 정수값(볼,스트라이크)를 통해 결과를 출력(Result)
        //게임을 다시 할지 묻기 (Re)


        //예외 처리도 추가
    }
}
