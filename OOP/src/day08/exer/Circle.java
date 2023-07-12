package day08.exer;

/**
 * DATE: 2022/11/9
 * Author: yjy --- BUPT
 */
public class Circle extends GeometricObject {

    private double radius;

    public Circle(double radius,String color, double weight) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return 3.14 * radius * radius;
    }

}
