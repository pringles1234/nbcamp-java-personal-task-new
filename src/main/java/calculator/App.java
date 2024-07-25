package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        System.out.println("사칙연산 기호를 입력하세요: ");
        // charAt(idx) : charAt 메서드는 매개변수로 char 타입으로 반환 하고자하는 문자열의 위치(index)를 받는다.
        char operator = sc.next().charAt(0);

            int result = 0;
            if(operator == '+'){
                result = num1 + num2;
                System.out.println("결과: " + result);
            }
            else if(operator == '-'){
                result = num1 - num2;
                System.out.println("결과: " + result);
            }
            else if(operator == '*'){
                result = num1 * num2;
                System.out.println("결과: " + result);
            }
            else if(operator == '/'){
                result = num1 / num2;
                System.out.println("결과: " + result);
                    if(num2 == 0);{
                    System.out.println("분모에 0이 입력될 수 없습니다.");
                }

            }


    }
}
