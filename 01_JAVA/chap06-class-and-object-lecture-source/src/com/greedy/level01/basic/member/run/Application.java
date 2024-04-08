package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.vo.MemberVO;

public class Application {
    public static void main(String[] args) {

        MemberVO membervo = new MemberVO();

        System.out.println("Id = " + membervo.getId());
        System.out.println("Id = " + membervo.getPwd());
        System.out.println("Id = " + membervo.getName());
        System.out.println("Id = " + membervo.getAge());
        System.out.println("Id = " + membervo.getGender());
        System.out.println("Id = " + membervo.getPhone());
        System.out.println("Id = " + membervo.getEmail());


        System.out.println("=============================================");

          membervo.setId("user01");
          membervo.setPwd("pass01");
          membervo.setName("홍길동");
          membervo.setAge(20);
          membervo.setGender('M');
          membervo.setPhone("010 - 1234 - 5678");
          membervo.setEmail("hong123@gerrdy.com");

        System.out.println("변경 후 Id = " + membervo.getId());
        System.out.println("변경 후 Id = " + membervo.getPwd());
        System.out.println("변경 후 Id = " + membervo.getName());
        System.out.println("변경 후 Id = " + membervo.getAge());
        System.out.println("변경 후 Id = " + membervo.getGender());
        System.out.println("변경 후 Id = " + membervo.getPhone());
        System.out.println("변경 후 Id = " + membervo.getEmail());





    }


}
