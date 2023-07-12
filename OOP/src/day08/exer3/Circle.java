package day08.exer3;

/**
 * DATE: 2022/11/9
 * Author: yjy --- BUPT
 */
/*
 * 定义一个Circle类，声明radius属性，提供getter和setter方法

 */
public class Circle {

    private Double radius;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Circle() {
        super();
    }

    public Circle(Double radius) {
        super();
        this.radius = radius;
    }


}