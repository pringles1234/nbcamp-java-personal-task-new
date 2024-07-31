package calculator;

// 예외처리 아직 진도 못나가서 빼고 진행

import java.util.ArrayList;

public class Calculator {

    private ArrayList<Integer> resultSave = new ArrayList<Integer>(); //연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성

    // Getter 메서드 구현
    public ArrayList<Integer> getResultSave() {
        return this.resultSave;
    }

    // Setter 메서드 구현
    public void setResultSave(int number) {
        this.resultSave.add(number);
    }

    // 가장 먼저 저장된 데이터 삭제 메서드
    public void removeResult(){
        this.resultSave.remove(0);
    }

    // 연산 결과 조회 메서드
    public void inquiryResults(){
        for(int element : resultSave){
            System.out.println("[ " + element + " ]");
        }
    }

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
