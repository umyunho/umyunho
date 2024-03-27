package com.ohgiraffers.section04.sort;

public class Application2 {
    public static void main(String[] args) {
        /*순차정렬에 대해 이해학 활용할 수 있다.*/
        /*
         * 순차 정렬이란 정렬 알고리즘에서 가장 간단하고 기본이 되는 알고리즘으로
         * 배열의 처음과 끝을 탐색하면서 순차대로 정렬하는 가장 기초적인 정렬 알고리즘이다.
         * */
        //1번자리의 숫자를 기준으로 끝까지 비교해보고 가면서 계속해서 조건에 맞는 숫자로 교환함
        //1번째자리 기준으로 한바퀴를 돌고나서는 첫번째 자리는 고정되고 두번쨰 자리부터 시작해서 끝까지 가면서 똑같이 비교
        //이런식으로해서 마지막줄 - 1 번째 까지 비교함

        int[] iarr = {2, 5, 4, 8, 1, 3};
        //인덱스(배열의 위치)를 하나씩 증가시키는 반복문

        for(int i = 1; i < iarr.length; i++){
            //인덱스가 증가할 때마다 처음부터 해당 인덱스까지 값을 비교하는 반복문
            for(int j = 0; j < i; j++){

                if(iarr[i]<iarr[j]){

                    int temp;
                    temp = iarr[i];
                    iarr[i] = iarr[j];
                    iarr[j] = temp;
                }

            }

        }
        for( int i : iarr){
            System.out.print( i + " ");
        }

    }

}

//내가 설정한 for문 따라서 하나씩 비교해가며 인덱스의 값을 변환해준다 변환 되더라도 for문에
//따라서 계속 진행되므로 값의 순서는 계속 바뀐다.
