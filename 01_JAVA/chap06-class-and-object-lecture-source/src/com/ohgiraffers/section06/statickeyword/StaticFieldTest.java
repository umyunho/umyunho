package com.ohgiraffers.section06.statickeyword;

public class StaticFieldTest {

    private int nonStsticCount;
    private static int staticCount;

    public StaticFieldTest(){}

    public int getNonStsticCount() {
        return this.nonStsticCount;
    }

    public int getStaticCount() {
        return StaticFieldTest.staticCount;
    }

    public void increaseNonStsticCount(){this.nonStsticCount++;}

    public void increaseStsticCount(){StaticFieldTest.staticCount++;}
}
