package day07.java;

/**
 * DATE: 2022/11/9
 * Author: yjy --- BUPT
 */
public class Man extends Person{

    int age ;
    String name ;
    double height ;
    //构造器
    public Man(String name, int age) {
        super(name, age);
    }

    public void earnMoney(){
        System.out.println("男人负责挣钱养家");
    }

    public void eat(){
        System.out.println("男人多吃肉，长肌肉");
    }

    public void walk(){
        System.out.println("男人霸气的走路");
    }

}