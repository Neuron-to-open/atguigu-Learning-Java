package day02.java1;

/**
 * DATE: 2022/11/11
 * Author: yjy --- BUPT
 */

import org.junit.Test;

/**
 * 使用同步机制将单例模式中的懒汉式改写为线程安全的
 *
 */
public class BankTest {

}

class Bank{

    private Bank(){}

    private static Bank instance = null;

    @Test
    public static Bank getInstance(){
        //方式一：效率稍差
//        synchronized (Bank.class) {
//            if(instance == null){
//
//                instance = new Bank();
//            }
//            return instance;
//        }
        //方式二：效率更高
        if(instance == null){

            synchronized (Bank.class) {
                if(instance == null){

                    instance = new Bank();
                }

            }
        }
        return instance;
    }

}
