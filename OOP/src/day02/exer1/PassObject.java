package day02.exer1;

/**
 * DATE: 2022/11/9
 * Author: yjy --- BUPT
 */
public class PassObject {

    public static void main(String[] args) {
        PassObject test = new PassObject() ;
        Circle c = new Circle() ;
        test.PrintArea(c , 5);
        System.out.println("now raidus is " + c.radius);
    }

    public void PrintArea(Circle c , int time){
        System.out.println("Radius\t\tArea");

        int i = 1 ;
        for ( ; i <= time ; i ++){
            c.radius = i ;
            double area = c.findArea() ;
            System.out.println(c.radius+"\t\t" +area);
        }

        c.radius = i ;
    }
}
