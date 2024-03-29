package Study01.Example01;

import java.util.Scanner;

/* 정수 한개를 입력 받아서, 그 수가 50이상의 수인지 50이하의 수인지 확인해보자*/
public class ex_01 {
    public void example(){
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 한개를 입력해주세요");
        int num =sc.nextInt();


        if(num < 50){
            System.out.println("입력하신 숫자는 50보다 작은 수 입니다.");
        }else{
            System.out.println("입력하신 숫자는 50보다 큰 수 입니다.");
        }
    }
}
