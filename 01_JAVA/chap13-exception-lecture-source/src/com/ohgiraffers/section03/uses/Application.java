package com.ohgiraffers.section03.uses;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {

        BufferedReader in = null;

        //String 문자열이 들어오면 글자를 하나하나 읽어보는것

        try {
            in = new BufferedReader(new FileReader("test.dat"));
            String s;
            while ((s = in.readLine()) != null){
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }finally{
            try {
                /*
                * NullPointerException이 발생한다.
                * null을 참조하는 상태에서 참조 연산자를 사용시 발생한 예외이다.
                * */
                if(in != null){
                    in.close();
                }
                in.close();

            } catch (IOException e) {

                throw new RuntimeException(e);

            }
        }



    }

}
