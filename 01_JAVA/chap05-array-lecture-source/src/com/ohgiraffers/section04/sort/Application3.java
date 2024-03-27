package com.ohgiraffers.section04.sort;

public class Application3 {
    public static void main(String[] args) {
        /*선택 정렬(select sort)에 대해 이해하고 적용할 수 있다.*/
        /*
        * 배열을 전부 탐색하여 최소값을 고르고 왼쪽부터 채워나가는 방식의 정렬
        * 데이터 양이 적을 때 좋은 성능을 나타낸다(교환횟수가 적음)
        * 하지만 배열을 전부 탐색하여 최소값을 찾아야 하기 때문에 100개 이상의 자료에서는 급격하게
        * 속도가 저하된다.
        * */
        //처음부터 끝까지 다 훑어보고 최소값을 제일 앞으로 빼고 다시 돌아와서 2번째부터 끝까지 훑고 최소값을 두번째 자리랑 교환----

        int[] iarr = {2,5,4,6,1,3};

        int min; /*최소값을 가진 데이터 인덱스 저장 변수용*/

        int temp;

        for(int i = 0; i < iarr.length - 1; i++){
            min = i;
            for(int j = i +1; j< iarr.length; j++){

                if(iarr[min] > iarr[j]){
                    min = j;
                }//값이 작을경우 min값으로 변경
            }//이 대괄호가 해당부분부터 끝까지 훑는 구문

            temp = iarr[min]; ///최소값을 가져옴
            iarr[min] = iarr[i]; //i=0부터 시작
            iarr[i] = temp;

        }

        for( int i : iarr){
            System.out.print( i + " ");
        }



    }



}
