package Study01.Example02;

import java.util.Scanner;

/*정수 한개를 입력받아서 3의 배수인지 확인해보자*/
public class ex_02 {
    public void example2(){
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력해주세요.");
        int num = sc.nextInt();

        if( num % 3 == 0 ){
            System.out.println("입력하신 숫자는 3의 배수입니다");
        }else{
            System.out.println("입력하신 숫자는 3의 배수가 아닙니다.");
        }
    }
}
