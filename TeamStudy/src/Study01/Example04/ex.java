package Study01.Example04;

import java.util.Scanner;

public class ex {
    public void ex4(){
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 세개를 입력해주세요.");
        int count = sc.nextInt();
        int[] num = new int[count];

        for(int i = 0; i < num.length; i++){
            System.out.print("num[" + i + "] = ");
            num[i] = sc.nextInt();
        }
        sc.close();
        int max = num[0];
        for(int i=1; i < num.length; i++){
            if(max < num[i]) max = num [i];
        }
        System.out.println("최댓값 : " + max);
    }



}
