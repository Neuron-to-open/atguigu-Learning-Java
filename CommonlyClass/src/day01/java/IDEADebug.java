package day01.java;

import org.junit.Test;

/**
 * DATE: 2022/11/16
 * Author: yjy --- BUPT
 */
public class IDEADebug {

    @Test
    public void testStringBuffer(){
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);//

        System.out.println(sb.length());//4

        System.out.println(sb);//"null"

        StringBuffer sb1 = new StringBuffer(str);//抛异常NullPointerException
        System.out.println(sb1);//

    }
}