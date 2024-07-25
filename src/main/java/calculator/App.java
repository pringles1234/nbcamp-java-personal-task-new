package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(;;) {
            System.out.println("첫 번째 숫자를 입력하세요: (종료하려면 exit 입력)");
            String input1 = sc.nextLine();
            if (input1.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            Integer num1 = Integer.valueOf(input1); // 문자열에서 정수로 형변환

            System.out.println("두 번째 숫자를 입력하세요: (종료하려면 exit 입력) ");
            String input2 = sc.nextLine();
            if (input2.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            Integer num2 = Integer.valueOf(input2); // 문자열에서 정수로 형변환

            System.out.println("사칙연산 기호를 입력하세요: (종료하려면 exit 입력) ");
            // charAt(idx) : charAt 메서드는 매개변수로 char 타입으로 반환 하고자하는 문자열의 위치(index)를 받는다.
            String operator = sc.nextLine();
            if (operator.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            int result = 0;
            if (operator.equals("+")) {
                result = num1 + num2;
                System.out.println("결과: " + result);
            } else if (operator.equals("-")) {
                result = num1 - num2;
                System.out.println("결과: " + result);
            } else if (operator.equals("*")) {
                result = num1 * num2;
                System.out.println("결과: " + result);
            } else if (operator.equals("/")) {
                if (num2 == 0) { // 분모에 0이 입력될 수 없는 조건 달아줌
                    System.out.println("분모에 0이 입력될 수 없습니다.");
                } else {
                    result = num1 / num2;
                    System.out.println("결과: " + result);
                }
            } else{ // 다른 기호를 입력하였을 경우
                System.out.println("모르는 기호입니다.");

            }
        }
    }
}
