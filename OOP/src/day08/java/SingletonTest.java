package day08.java;

/**
 * DATE: 2022/11/6
 * Author: yjy --- BUPT
 */
public class SingletonTest {
    public static void main(String[] args) {

        Bank bank1 = Bank.instance;

//		Bank.instance = null;
        Bank bank2 = Bank.instance;

        System.out.println(bank1 == bank2);

    }
}

class Bank{

    private Bank(){

    }

    public static final Bank instance = new Bank();

}

