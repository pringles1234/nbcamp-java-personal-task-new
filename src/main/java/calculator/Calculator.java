package calculator;

// 예외처리 아직 진도 못나가서 빼고 진행

import java.util.ArrayList;

public class Calculator {

    ArrayList<Integer> resultSave = new ArrayList<Integer>(); //연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성

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
