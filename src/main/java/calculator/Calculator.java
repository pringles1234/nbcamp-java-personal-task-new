package calculator;

// 예외처리 아직 진도 못나가서 빼고 진행

import java.util.ArrayList;

public class Calculator {

    private ArrayList<Integer> resultSave = new ArrayList<Integer>(); //연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성

    public ArrayList<Integer> getResultSave() {
        return this.resultSave;
    } // Getter 메서드 구현

    public void setResultSave(int number) {
        this.resultSave.add(number);
    } // Setter 메서드 구현

    public void setResultSave() {
        this.resultSave.remove(0);
    } // Setter 메서드 구현

    //사칙연산 결과 반환 메서드
    public int calculate(int num1, int num2, char operator) {
        int result = 0;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 == 0) { // 분모에 0이 입력될 수 없는 조건 달아줌
                System.out.println("분모에 0이 입력될 수 없습니다.");
            } else {
                result = num1 / num2;
            }
        }
        return result;
    }
}
