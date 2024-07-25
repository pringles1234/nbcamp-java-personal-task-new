package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<Integer>(); //리스트 생성
        // int[] arr = new int[10]; 배열생성
        // int count = 0; 연산 결과 저장된 배열의 마지막 index 저장하는 변수 -> 사용안함

        Scanner sc = new Scanner(System.in);
        while(true) { // for문에서 while 문으로 수정 -> 무한루프
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
            } else if (operator.equals("-")) {
                result = num1 - num2;
            } else if (operator.equals("*")) {
                result = num1 * num2;
            } else if (operator.equals("/")) {
                if (num2 == 0) { // 분모에 0이 입력될 수 없는 조건 달아줌
                    System.out.println("분모에 0이 입력될 수 없습니다.");
                    continue;
                } else {
                    result = num1 / num2;
                }
            } else{ // 다른 기호를 입력하였을 경우
                System.out.println("모르는 기호입니다.");
                continue; // 다른 기호를 입력한 경우 배열에 저장하지 않고 넘어감
            }
            System.out.println("결과: " + result);
            //arr[i] = result;
            intList.add(result);

            if(intList.size() > 10){
                intList.remove(0);
            }
            System.out.println(intList.toString());
        }
    }
}
