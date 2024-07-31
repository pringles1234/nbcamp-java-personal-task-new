package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(); //Calculator 인스턴스 생성

        ArrayList<Integer> intList = new ArrayList<Integer>(); //리스트 생성


        Scanner sc = new Scanner(System.in);
        while(true) { // for문에서 while 문으로 수정 -> 무한루프
            System.out.println("첫 번째 숫자를 입력하세요: ");
            String input1 = sc.nextLine();
            Integer num1 = Integer.valueOf(input1); // 문자열에서 정수로 형변환

            System.out.println("두 번째 숫자를 입력하세요: ");
            String input2 = sc.nextLine();
            Integer num2 = Integer.valueOf(input2); // 문자열에서 정수로 형변환

            System.out.println("사칙연산 기호를 입력하세요: ");
            char operator = sc.nextLine().charAt(0);

            int result = calculator.calculate(num1, num2, operator); //사칙연산 메서드

            System.out.println("결과 : " + result);

            calculator.setResultSave(result);


            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제, enter 클릭 시 다시 계산)");
            String removeItem = sc.nextLine();
            if(removeItem.equals("remove")){
                calculator.removeResult(); // 첫번째 인덱스 값 삭제해줌
                System.out.println("가장 먼저 저장된 연산 결과가 삭제되었습니다.");
            }


            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiryItem = sc.nextLine();
            if(inquiryItem.equals("inquiry")){
                System.out.println("저장된 연산 결과 : ");
                for(int element : calculator.getResultSave()){
                    System.out.println("[ " + element + " ]");
                }
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료, enter 클릭 시 다시 계산)");
            String continueInput = sc.nextLine();
            if (continueInput.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

        }
    }
}
