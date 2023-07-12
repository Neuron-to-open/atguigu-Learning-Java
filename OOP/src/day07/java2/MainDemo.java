package day07.java2;

/**
 * DATE: 2022/11/9
 * Author: yjy --- BUPT
 */
public class MainDemo {

    public static void main(String[] args) {

        for(int i = 0;i < args.length;i++){
            System.out.println("*****" + args[i]);

            int num = Integer.parseInt(args[i]);
            System.out.println("#####" + num);

        }

    }

}
