package day02.java1;

/**
 * DATE: 2022/11/9
 * Author: yjy --- BUPT
 */
public class ValueTransferTest1 {

    public static void main(String[] args) {
        int m = 10;
        int n = 20;

        System.out.println("m = " + m + ", n = " + n);
        //交换两个变量的值的操作
//		int temp = m ;
//		m = n;
//		n = temp;

        ValueTransferTest1 test = new ValueTransferTest1();
        test.swap(m, n);

        System.out.println("m = " + m + ", n = " + n);


    }

    public void swap(int m,int n){
        int temp = m ;
        m = n;
        n = temp;
    }

}
